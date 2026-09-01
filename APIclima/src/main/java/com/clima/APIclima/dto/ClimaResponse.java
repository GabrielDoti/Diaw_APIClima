package com.clima.APIclima.dto;

import java.time.LocalDateTime;

public class ClimaResponse {
    private String cidade;
    private double temperaturaAtual;
    private double umidade;
    private double velocidadeVento;
    private double direcaoVento;
    private double temperaturaMax;
    private double temperaturaMin;
    private String condicoes;
    private LocalDateTime dataConsulta;

    public ClimaResponse() {}

    public ClimaResponse
            (String cidade, double temperaturaAtual, double umidade,
             double velocidadeVento, double direcaoVento,
             double temperaturaMax, double temperaturaMin,
             String condicoes, LocalDateTime dataConsulta)
    {
        this.cidade = cidade;
        this.temperaturaAtual = temperaturaAtual;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        this.direcaoVento = direcaoVento;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.condicoes = condicoes;
        this.dataConsulta = dataConsulta;
    }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public double getTemperaturaAtual() { return temperaturaAtual; }
    public void setTemperaturaAtual(double temperaturaAtual) { this.temperaturaAtual = temperaturaAtual; }

    public double getUmidade() { return umidade; }
    public void setUmidade(double umidade) { this.umidade = umidade; }

    public double getVelocidadeVento() { return velocidadeVento; }
    public void setVelocidadeVento(double velocidadeVento) { this.velocidadeVento = velocidadeVento; }

    public double getDirecaoVento() { return direcaoVento; }
    public void setDirecaoVento(double direcaoVento) { this.direcaoVento = direcaoVento; }

    public double getTemperaturaMax() { return temperaturaMax; }
    public void setTemperaturaMax(double temperaturaMax) { this.temperaturaMax = temperaturaMax; }

    public double getTemperaturaMin() { return temperaturaMin; }
    public void setTemperaturaMin(double temperaturaMin) { this.temperaturaMin = temperaturaMin; }

    public String getCondicoes() { return condicoes; }
    public void setCondicoes(String condicoes) { this.condicoes = condicoes; }

    public LocalDateTime getDataConsulta() { return dataConsulta; }
    public void setDataConsulta(LocalDateTime dataConsulta) { this.dataConsulta = dataConsulta; }
}
