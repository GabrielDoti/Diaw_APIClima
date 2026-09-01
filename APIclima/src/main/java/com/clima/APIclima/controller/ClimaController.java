package com.clima.APIclima.controller;

import com.clima.APIclima.dto.ClimaResponse;
import com.clima.APIclima.service.ClimaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClimaController {
    private final ClimaService climaService;

    public ClimaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/clima/belo-horizonte")
    public ClimaResponse getClimaBeloHorizonte() {
        return climaService.buscarClimaBeloHorizonte();
    }
}

