package com.WayUpIt.demo.infrastructure.persistence.repo;

import com.WayUpIt.demo.domain.model.Phase;
import com.WayUpIt.demo.domain.repository.PhaseRepository;
import com.WayUpIt.demo.infrastructure.persistence.entity.PhaseEntity;
import com.WayUpIt.demo.infrastructure.persistence.mapper.PhaseMapper;
import com.WayUpIt.demo.infrastructure.persistence.repo.jpa.PhaseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;



@Repository
public class PhaseRepoImpl implements PhaseRepository {

    private final PhaseRepo phaseRepo;

    public PhaseRepoImpl(@Lazy PhaseRepo phaseRepo) {
        this.phaseRepo = phaseRepo;
    }


    @Override
    public LocalDate findDeadLine(Long id) {

        Optional<Phase> phase = phaseRepo.findById(id).map(PhaseMapper::toDomain);
        if (phase.isPresent()){
            return phase.get().getEnd_date();
        }
        else {
            return null;
        }


    }
}
