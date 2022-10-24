package com.security.informationsystemssecurity.repository;

import com.security.informationsystemssecurity.model.dto.BasicsDTO;
import com.security.informationsystemssecurity.model.dto.DirectionDTO;
import com.security.informationsystemssecurity.model.dto.StageDTO;
import com.security.informationsystemssecurity.model.enums.DirectionEnum;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.security.informationsystemssecurity.model.enums.DirectionEnum.*;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class DirectionsRepositoryImpl implements DirectionsRepository {
    private List<DirectionDTO> directionDTOS = Arrays.asList(
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            )
                    ),
                    INFORMATION_SYSTEM_OBJECTS_SECURITY
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            )
                    ),
                    PROCESSES_AND_PROGRAMS_SECURITY
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            )
                    ),
                    COMMUNICATIONS_CHANNELS_SECURITY
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            )
                    ),
                    EMP_SUPPRESSION
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.25"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            ),
                            new StageDTO(
                                    new BasicsDTO(new BigDecimal("0.5"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.2"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    new BasicsDTO(new BigDecimal("0.15"), BigDecimal.ZERO, BigDecimal.ZERO, 0),
                                    BigDecimal.ZERO
                            )
                    ),
                    SECURITY_SYSTEM_CONTROL
            )
    );

    @Override
    public List<StageDTO> findByDirection(DirectionEnum directionEnum) {
        return directionDTOS.stream()
                .filter(directionDTO -> directionDTO.getDirectionEnum().equals(directionEnum))
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getStageDTOS();
    }
}
