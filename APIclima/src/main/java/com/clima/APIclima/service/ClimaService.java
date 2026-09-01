package com.clima.APIclima.service;

import com.clima.APIclima.dto.ClimaResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class ClimaService {

    private static final String URL_OPEN_METEO = "https://api.open-meteo.com/v1/forecast?latitude=-19.9167&longitude=-43.9345" + "&current=temperature_2m,relative_humidity_2m,wind_speed_10m,wind_direction_10m" + "&daily=temperature_2m_max,temperature_2m_min" + "&timezone=America/Sao_Paulo";

    public ClimaResponse buscarClimaBeloHorizonte() {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> resposta = restTemplate.getForObject(URL_OPEN_METEO, Map.class);

        Map<String, Object> current = (Map<String, Object>) resposta.get("current");

        Map<String, Object> daily = (Map<String, Object>) resposta.get("daily");
        List<Double> tempMaxList = (List<Double>) daily.get("temperature_2m_max");
        List<Double> tempMinList = (List<Double>) daily.get("temperature_2m_min");

        return new ClimaResponse(
                "Belo Horizonte",
                ((Number) current.get("temperature_2m")).doubleValue(),
                ((Number) current.get("relative_humidity_2m")).doubleValue(),
                ((Number) current.get("wind_speed_10m")).doubleValue(),
                ((Number) current.get("wind_direction_10m")).doubleValue(),
                tempMaxList.get(0),
                tempMinList.get(0),
                "N/A",
                LocalDateTime.now()
        );

    }
}
