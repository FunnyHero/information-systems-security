package com.security.informationsystemssecurity.repository;

import com.security.informationsystemssecurity.model.dto.StageDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class SecurityGradeRepositoryImpl implements SecurityGradeRepository {
    private List<StageDTO> stageDTOS;

    @Override
    public void delete() {
        stageDTOS.clear();
    }

    @Override
    public void save(List<StageDTO> newStageDTOS) {
        stageDTOS = newStageDTOS;
    }

    @Override
    public List<StageDTO> findAll() {
        return stageDTOS;
    }


}
