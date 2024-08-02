package com.WayUpIt.demo.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
}
