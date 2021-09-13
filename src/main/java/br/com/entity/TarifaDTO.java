package br.com.entity;

import javax.persistence.*;

public class TarifaDTO {

    private Integer origem;

    private Integer destino;

    private Double valorPorMinuto;

    public TarifaDTO(Integer origem, Integer destino, Double valorPorMinuto) {
        this.origem = origem;
        this.destino = destino;
        this.valorPorMinuto = valorPorMinuto;
    }

    public Tarifa toModel(){
        return new Tarifa(origem, destino, valorPorMinuto);
    }

}
