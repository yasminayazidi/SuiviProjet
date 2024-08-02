package com.WayUpIt.demo.infrastructure.persistence.mapper;

import com.WayUpIt.demo.domain.model.Phase;
import com.WayUpIt.demo.infrastructure.persistence.entity.PhaseEntity;

import static java.util.Objects.requireNonNull;

public class PhaseMapper {

    public static Phase toDomain(PhaseEntity phaseEntity){
    requireNonNull(phaseEntity, "phase entity could not be null");
    return Phase.builder()
            .id(phaseEntity.getId())
            .name(phaseEntity.getName())
            .start_date(phaseEntity.getStart_date())
            .end_date(phaseEntity.getEnd_date())
            .build();
    }

    public static PhaseEntity toEntity(Phase phase){
    requireNonNull(phase,"phase model could not be null");
    return PhaseEntity.builder()
            .id(phase.getId())
            .name(phase.getName())
            .start_date(phase.getStart_date())
            .end_date(phase.getEnd_date())
            .build();

    }

}
