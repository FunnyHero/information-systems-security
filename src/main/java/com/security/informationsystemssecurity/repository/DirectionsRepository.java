package com.security.informationsystemssecurity.repository;

import com.security.informationsystemssecurity.model.dto.StageDTO;
import com.security.informationsystemssecurity.model.enums.DirectionEnum;

import java.util.List;

public interface DirectionsRepository {
    List<StageDTO> findByDirection(DirectionEnum directionEnum);
}
