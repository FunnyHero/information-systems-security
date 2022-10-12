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
                                    new BasicsDTO(111,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(112,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(113,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(114,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(211,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(212,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(213,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(214,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(311,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(312,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(313,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(314,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(411,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(412,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(413,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(414,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(511,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(512,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(513,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(514,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(611,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(612,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(613,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(614,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(711,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(712,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(713,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(714,new BigDecimal("0.15"),null,null,null),
                                    null
                            )
                    ),
                    INFORMATION_SYSTEM_OBJECTS_SECURITY
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(121,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(122,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(123,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(124,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(221,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(222,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(223,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(224,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(321,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(322,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(323,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(324,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(421,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(422,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(423,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(424,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(521,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(522,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(523,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(524,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(621,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(622,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(623,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(624,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(721,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(722,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(723,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(724,new BigDecimal("0.25"),null,null,null),
                                    null
                            )
                    ),
                    PROCESSES_AND_PROGRAMS_SECURITY
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(131,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(132,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(133,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(134,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(231,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(232,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(233,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(234,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(331,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(332,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(333,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(334,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(431,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(432,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(433,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(434,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(531,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(532,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(533,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(534,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(631,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(632,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(633,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(634,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(731,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(732,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(733,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(734,new BigDecimal("0.25"),null,null,null),
                                    null
                            )
                    ),
                    COMMUNICATIONS_CHANNELS_SECURITY
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(141,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(142,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(143,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(144,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(241,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(242,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(243,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(244,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(341,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(342,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(343,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(344,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(441,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(442,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(443,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(444,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(541,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(542,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(543,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(544,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(641,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(642,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(643,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(644,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(741,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(742,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(743,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(744,new BigDecimal("0.25"),null,null,null),
                                    null
                            )
                    ),
                    EMP_SUPPRESSION
            ),
            new DirectionDTO(
                    Arrays.asList(
                            new StageDTO(
                                    new BasicsDTO(151,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(152,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(153,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(154,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(251,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(252,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(253,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(254,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(351,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(352,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(353,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(354,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(451,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(452,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(453,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(454,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(551,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(552,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(553,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(554,new BigDecimal("0.15"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(651,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(652,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(653,new BigDecimal("0.25"),null,null,null),
                                    new BasicsDTO(654,new BigDecimal("0.25"),null,null,null),
                                    null
                            ),
                            new StageDTO(
                                    new BasicsDTO(751,new BigDecimal("0.5"),null,null,null),
                                    new BasicsDTO(752,new BigDecimal("0.2"),null,null,null),
                                    new BasicsDTO(753,new BigDecimal("0.15"),null,null,null),
                                    new BasicsDTO(754,new BigDecimal("0.15"),null,null,null),
                                    null
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
