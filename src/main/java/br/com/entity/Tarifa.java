package br.com.entity;

import javax.persistence.*;

@Entity
public class Tarifa {

    @Id
    @Column(name = "id_tarifa", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarifa;

    @Column(name = "origem", nullable = false)
    private String origem;

    @Column(name = "destino", nullable = false)
    private String destino;

    @Column(name = "valor", nullable = false)
    private String valor;

    public Long getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Long idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
