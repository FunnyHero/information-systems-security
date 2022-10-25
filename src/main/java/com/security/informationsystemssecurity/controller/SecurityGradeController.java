package com.security.informationsystemssecurity.controller;

import com.security.informationsystemssecurity.model.dto.DirectionDTO;
import com.security.informationsystemssecurity.model.enums.DirectionEnum;
import com.security.informationsystemssecurity.service.SecurityGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

import static com.security.informationsystemssecurity.model.enums.DirectionEnum.valueOf;

@Controller
@RequiredArgsConstructor
public class SecurityGradeController {
    private final SecurityGradeService securityGradeService;
    private static final String REQUIRED_SECURITY_PROFILE = "requiredSecurityProfile";

    @GetMapping
    public String getMatrix() {
        return "matrix";
    }

    @PostMapping
    public String postSecurityGrade(Model model, HttpServletRequest request) {
        DirectionEnum direction = valueOf(request.getParameterValues("direction")[0]);

        BigDecimal requiredSecurityProfile = new BigDecimal(request.getParameterValues(REQUIRED_SECURITY_PROFILE)[0]);
        requiredSecurityProfile = requiredSecurityProfile.divide(new BigDecimal("100"));
        model.addAttribute(REQUIRED_SECURITY_PROFILE, requiredSecurityProfile);

        DirectionDTO directionDTO = new DirectionDTO(securityGradeService.findByDirection(direction), direction);
        model.addAttribute("stages", directionDTO);
        return "securityGrade";
    }

    @PostMapping("securityGrade")
    public String countSecurityGrade(@ModelAttribute("stages") DirectionDTO stages,
                                     @ModelAttribute(REQUIRED_SECURITY_PROFILE) BigDecimal requiredSecurityProfile,
                                     Model model) {
        securityGradeService.save(stages.getStageDTOS());
        securityGradeService.countSecurityGrade(requiredSecurityProfile);
        model.addAttribute("qualityGrade", securityGradeService.getQualityGrade());
        model.addAttribute("quantityGrade", securityGradeService.getQuantityGrade());
        return "countSecurityGrade";
    }
}
