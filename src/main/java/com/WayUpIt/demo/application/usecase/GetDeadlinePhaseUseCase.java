package com.WayUpIt.demo.application.usecase;

import com.WayUpIt.demo.domain.repository.PhaseRepository;

import java.time.LocalDate;

public class GetDeadlinePhaseUseCase {

    private final PhaseRepository phaseRepository;

    public GetDeadlinePhaseUseCase(PhaseRepository phaseRepository) {
        this.phaseRepository = phaseRepository;
    }

   public LocalDate execute(Long id) {
        return phaseRepository.findDeadLine(id);
    }

}
