package br.com.dto;

import br.com.enums.Plano;

public class CalculaTarifaDTO {

    private Integer origem;

    private Integer destino;

    private Integer minutosFalado;

    private Plano plano;

    public Integer getOrigem() {
        return origem;
    }

    public Integer getDestino() {
        return destino;
    }

    public Integer getMinutosFalado() {
        return minutosFalado;
    }

    public Plano getPlano() {
        return plano;
    }

}
