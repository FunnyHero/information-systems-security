package com.security.informationsystemssecurity.service;

import com.security.informationsystemssecurity.model.dto.StageDTO;
import com.security.informationsystemssecurity.model.enums.DirectionEnum;

import java.math.BigDecimal;
import java.util.List;

public interface SecurityGradeService {
    List<StageDTO> findAll();
    List<StageDTO> findByDirection(DirectionEnum directionEnum);
    void save(List<StageDTO> newStageDTOS);
    void countSecurityGrade(BigDecimal requiredSecurityProfile);
    BigDecimal getQualityGrade();
    BigDecimal getQuantityGrade();
}
