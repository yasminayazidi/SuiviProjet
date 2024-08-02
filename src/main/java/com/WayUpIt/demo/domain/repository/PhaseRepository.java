package com.WayUpIt.demo.domain.repository;

import com.WayUpIt.demo.domain.model.Phase;

import java.time.LocalDate;

public interface PhaseRepository {

    LocalDate findDeadLine(Long id);
}
