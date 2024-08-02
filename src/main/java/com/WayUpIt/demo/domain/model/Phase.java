package com.WayUpIt.demo.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class Phase {
    private Long id;
    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
}
