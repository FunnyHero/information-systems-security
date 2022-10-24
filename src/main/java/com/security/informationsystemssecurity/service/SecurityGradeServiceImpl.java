package com.security.informationsystemssecurity.service;

import com.security.informationsystemssecurity.model.dto.StageDTO;
import com.security.informationsystemssecurity.model.enums.DirectionEnum;
import com.security.informationsystemssecurity.repository.DirectionsRepository;
import com.security.informationsystemssecurity.repository.SecurityGradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SecurityGradeServiceImpl implements SecurityGradeService {
    private final SecurityGradeRepository securityGradeRepository;
    private final DirectionsRepository directionsRepository;

    @Override
    public List<StageDTO> findAll() {
        return securityGradeRepository.findAll();
    }

    @Override
    public List<StageDTO> findByDirection(DirectionEnum directionEnum) {
        return directionsRepository.findByDirection(directionEnum);
    }

    @Override
    public void save(List<StageDTO> newStageDTOS) {
        securityGradeRepository.save(newStageDTOS);
    }

    @Override
    public void countSecurityGrade(BigDecimal requiredSecurityProfile) {
        List<StageDTO> stageDTOS = findAll();
        countAchievedSecProfileWithImportanceFactor(stageDTOS);
        compareProfiles(stageDTOS, requiredSecurityProfile);
        countRequirementGroupsFulfillment(stageDTOS);
    }

    @Override
    public BigDecimal getQualityGrade() {
        List<StageDTO> stageDTOS = findAll();
        BigDecimal sum = BigDecimal.ZERO;
        int roundingScale = 5;

        for (StageDTO stageDTO : stageDTOS) {
            sum = sum.add(stageDTO.getRequirementGroupsFulfillment());
        }

        return sum.divide(BigDecimal.valueOf(stageDTOS.size()), roundingScale, RoundingMode.HALF_EVEN);
    }

    @Override
    public BigDecimal getQuantityGrade() {
        List<StageDTO> stageDTOS = findAll();
        Integer sum = 0;
        int roundingScale = 5;

        for (StageDTO stageDTO : stageDTOS) {
            sum += stageDTO.getBase().getProfileComparison();
            sum += stageDTO.getStructure().getProfileComparison();
            sum += stageDTO.getMeasures().getProfileComparison();
            sum += stageDTO.getResources().getProfileComparison();
        }

        return BigDecimal.valueOf(sum)
                .divide(BigDecimal.valueOf(stageDTOS.size() * 4L), roundingScale, RoundingMode.HALF_EVEN);
    }

    private void countAchievedSecProfileWithImportanceFactor(List<StageDTO> stageDTOS) {
        for (StageDTO stageDTO : stageDTOS) {
            stageDTO.getBase()
                    .setImportanceFactorMultiplyByAchievedSecurityProfile(
                            stageDTO.getBase()
                                    .getImportanceFactor()
                                    .multiply(stageDTO.getBase().getAchievedSecurityProfile())
                    );
            stageDTO.getStructure()
                    .setImportanceFactorMultiplyByAchievedSecurityProfile(
                            stageDTO.getStructure()
                                    .getImportanceFactor()
                                    .multiply(stageDTO.getStructure().getAchievedSecurityProfile())
                    );
            stageDTO.getMeasures()
                    .setImportanceFactorMultiplyByAchievedSecurityProfile(
                            stageDTO.getMeasures()
                                    .getImportanceFactor()
                                    .multiply(stageDTO.getMeasures().getAchievedSecurityProfile())
                    );
            stageDTO.getResources()
                    .setImportanceFactorMultiplyByAchievedSecurityProfile(
                            stageDTO.getResources()
                                    .getImportanceFactor()
                                    .multiply(stageDTO.getResources().getAchievedSecurityProfile())
                    );
        }
    }

    private void compareProfiles(List<StageDTO> stageDTOS, BigDecimal requiredSecurityProfile) {
        for (StageDTO stageDTO : stageDTOS) {
            stageDTO.getBase()
                    .setProfileComparison(
                            stageDTO.getBase()
                                    .getAchievedSecurityProfile()
                                    .compareTo(requiredSecurityProfile) < 0 ? 0 : 1
                    );
            stageDTO.getStructure()
                    .setProfileComparison(
                            stageDTO.getStructure()
                                    .getAchievedSecurityProfile()
                                    .compareTo(requiredSecurityProfile) < 0 ? 0 : 1
                    );
            stageDTO.getMeasures()
                    .setProfileComparison(
                            stageDTO.getMeasures()
                                    .getAchievedSecurityProfile()
                                    .compareTo(requiredSecurityProfile) < 0 ? 0 : 1
                    );
            stageDTO.getResources()
                    .setProfileComparison(
                            stageDTO.getResources()
                                    .getAchievedSecurityProfile()
                                    .compareTo(requiredSecurityProfile) < 0 ? 0 : 1
                    );
        }
    }

    private void countRequirementGroupsFulfillment(List<StageDTO> stageDTOS) {
        for (StageDTO stageDTO : stageDTOS) {
            stageDTO.setRequirementGroupsFulfillment(
                    stageDTO.getBase().getImportanceFactorMultiplyByAchievedSecurityProfile().add(
                            stageDTO.getStructure().getImportanceFactorMultiplyByAchievedSecurityProfile()
                    ).add(
                            stageDTO.getMeasures().getImportanceFactorMultiplyByAchievedSecurityProfile()
                    ).add(
                            stageDTO.getResources().getImportanceFactorMultiplyByAchievedSecurityProfile()
                    )
            );
        }
    }
}
