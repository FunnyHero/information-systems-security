package com.security.informationsystemssecurity.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BasicsEnum {
    BASE("Нормативно-правовая и научная база"),
    STRUCTURE("Структура и задачи органов"),
    MEASURES("Организационные меры и методы (политика безопасности)"),
    RESOURCES("Программно-технические способы и средства");

    private final String basicsName;
}
