package br.com.entity;

import javax.persistence.*;

@Entity
public class Tarifa {

    @Id
    @Column(name = "id_tarifa", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarifa;

    @Column(name = "origem", nullable = false)
    private Integer origem;

    @Column(name = "destino", nullable = false)
    private Integer destino;

    @Column(name = "valor_por_minuto", nullable = false)
    private Double valorPorMinuto;

    public Tarifa(Integer origem, Integer destino, Double valorPorMinuto) {
        this.origem = origem;
        this.destino = destino;
        this.valorPorMinuto = valorPorMinuto;
    }

    public Long getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Long idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Integer getOrigem() {
        return origem;
    }

    public void setOrigem(Integer origem) {
        this.origem = origem;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    public Double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(Double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }

    public TarifaDTO toDTO(){
        return new TarifaDTO(origem, destino, valorPorMinuto);
    }
}
