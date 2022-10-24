package com.security.informationsystemssecurity.repository;

import com.security.informationsystemssecurity.model.dto.StageDTO;

import java.util.List;

public interface SecurityGradeRepository {
    void delete();

    void save(List<StageDTO> newStageDTOS);

    List<StageDTO> findAll();
}
