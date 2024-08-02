package com.WayUpIt.demo.infrastructure.persistence.repo.jpa;

import com.WayUpIt.demo.domain.model.Phase;
import com.WayUpIt.demo.infrastructure.persistence.entity.PhaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PhaseRepo extends JpaRepository<PhaseEntity,Long> {

}
