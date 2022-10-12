package com.security.informationsystemssecurity.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StageDTO {
    private BasicsDTO base;
    private BasicsDTO structure;
    private BasicsDTO measures;
    private BasicsDTO resources;
    private BigDecimal requirementGroupsFulfillment;
}
