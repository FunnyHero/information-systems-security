package com.security.informationsystemssecurity.controller;

import com.security.informationsystemssecurity.model.dto.StageDTO;
import com.security.informationsystemssecurity.service.SecurityGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

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
    public String getSecurityGrade(Model model, HttpServletRequest request) {
//        List<StageDTO> stageDTOS = Arrays.asList(
//                new StageDTO(
//                        new BasicsDTO(121,new BigDecimal("0.2"),new BigDecimal("0.5"),null,null),
//                        new BasicsDTO(122,new BigDecimal("0.3"),new BigDecimal("0.4"),null,null),
//                        new BasicsDTO(123,new BigDecimal("0.1"),new BigDecimal("0.9"),null,null),
//                        new BasicsDTO(124,new BigDecimal("0.4"),new BigDecimal("0.1"),null,null),
//                        null
//                ),
//                new StageDTO(
//                        new BasicsDTO(131,new BigDecimal("0.2"),new BigDecimal("0.2"),null,null),
//                        new BasicsDTO(132,new BigDecimal("0.2"),new BigDecimal("0.3"),null,null),
//                        new BasicsDTO(133,new BigDecimal("0.2"),new BigDecimal("0.4"),null,null),
//                        new BasicsDTO(134,new BigDecimal("0.2"),new BigDecimal("0.5"),null,null),
//                        null
//                )
//        );
//        securityGradeService.save(stageDTOS);
        securityGradeService.save(securityGradeService.findByDirection(valueOf(request.getParameterValues("direction")[0])));
        BigDecimal requiredSecurityProfile = new BigDecimal(request.getParameterValues(REQUIRED_SECURITY_PROFILE)[0]);
        requiredSecurityProfile = requiredSecurityProfile.divide(new BigDecimal("100"));
        //TODO putMapping изменение параметров в матрице для расчета (сейчас при расчете NPE)
//        securityGradeService.countSecurityGrade(requiredSecurityProfile);
        model.addAttribute(REQUIRED_SECURITY_PROFILE, requiredSecurityProfile);
        model.addAttribute("stages", securityGradeService.findAll());
//        model.addAttribute("qualityGrade", securityGradeService.getQualityGrade());
//        model.addAttribute("quantityGrade", securityGradeService.getQuantityGrade());
        return "securityGrade";
    }

    @PostMapping("securityGrade")
    public String countSecurityGrade(@ModelAttribute("stages")List<StageDTO> stages) {
        System.out.println(stages.toString());
        return "countSecurityGrade";
    }
}
