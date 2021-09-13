package br.com.dto;

public class ValoresPorMinutoDTO {

    private double valorMinutosSemPlano;
    private double valorMinutosComPlano;

    public ValoresPorMinutoDTO(double valorMinutosSemPlano, double valorMinutosComPlano) {
        this.valorMinutosComPlano = valorMinutosComPlano;
        this.valorMinutosSemPlano = valorMinutosSemPlano;
    }
}
