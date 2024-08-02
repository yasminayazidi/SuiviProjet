package com.WayUpIt.demo.application.service;

import com.WayUpIt.demo.application.usecase.GetDeadlinePhaseUseCase;

import java.time.LocalDate;

public class PhaseService {

    private final GetDeadlinePhaseUseCase getDeadlinePhaseUseCase;

    public PhaseService(GetDeadlinePhaseUseCase getDeadlinePhaseUseCase) {
        this.getDeadlinePhaseUseCase = getDeadlinePhaseUseCase;
    }

    public LocalDate getDeadline(Long id){
        return getDeadlinePhaseUseCase.execute(id);
    };

}
