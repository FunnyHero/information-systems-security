package com.security.informationsystemssecurity.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StageEnum {
    INFORMATION_TO_BE_PROTECTED("Определение информации, подлежащей защите"),
    IDENTIFICATION_OF_POTENTIAL_THREATS("Выявление полного множества потенциально " +
            "возможных угроз и каналов утечки информации"),
    ASSESSMENT_OF_VULNERABILITY_AND_RISKS("Проведение оценки уязвимости и рисков информации " +
            "при имеющемся множестве угроз и каналов утечки"),
    DETERMINATION_OF_REQUIREMENTS_FOR_PROTECTION_SYSTEM("Определение требований к системе защиты"),
    CHOICE_OF_INFORMATION_SECURITY_TOOLS("Осуществление выбора средств защиты информации и их характеристик"),
    IMPLEMENTATION_OF_REMEDIES("Внедрение и организация использования выбранных мер, способов и средств защиты"),
    IMPLEMENTATION_OF_INTEGRITY_CONTROL_AND_MANAGEMENT_OF_SECURITY_SYSTEM("Осуществление контроля целостности " +
            "и управление системой защиты");

    private final String stageName;
}
