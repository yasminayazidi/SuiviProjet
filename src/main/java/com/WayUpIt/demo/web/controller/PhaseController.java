package com.WayUpIt.demo.web.controller;

import com.WayUpIt.demo.application.service.PhaseService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/test/v1")
@CrossOrigin("*")
public class PhaseController {
    private final PhaseService phaseService;

    public PhaseController(PhaseService phaseService) {
        this.phaseService = phaseService;
    }


    @GetMapping("/phases/{phaseId}/deadlines")
    public LocalDate getDeadline(@PathVariable("phaseId") Long id){
        return phaseService.getDeadline(id);
    }
}
