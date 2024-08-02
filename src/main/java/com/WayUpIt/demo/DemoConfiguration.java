package com.WayUpIt.demo;

import com.WayUpIt.demo.application.service.PhaseService;
import com.WayUpIt.demo.application.usecase.GetDeadlinePhaseUseCase;
import com.WayUpIt.demo.domain.repository.PhaseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {
    @Bean
    public PhaseService phaseService(GetDeadlinePhaseUseCase getDeadlinePhaseUseCase
                                   )
    {
        return new PhaseService(getDeadlinePhaseUseCase);
    }

    @Bean
    public GetDeadlinePhaseUseCase getDeadlinePhaseUseCase(PhaseRepository phaseRepository){
        return new GetDeadlinePhaseUseCase(phaseRepository);
    }

}
