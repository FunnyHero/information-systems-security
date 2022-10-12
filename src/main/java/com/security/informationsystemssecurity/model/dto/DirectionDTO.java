package com.security.informationsystemssecurity.model.dto;

import com.security.informationsystemssecurity.model.enums.DirectionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DirectionDTO {
    private List<StageDTO> stageDTOS;
    private DirectionEnum directionEnum;
}
