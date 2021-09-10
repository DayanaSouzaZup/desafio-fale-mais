package br.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "planos")
public class PlanoFaleMais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlano;

    private String FaleMais30;

    private String FaleMais60;

    private String FaleMais90;

    private String FaleMais120;

    @ManyToMany
    @JoinColumn(name = "idTarifa", nullable = false)
    private Tarifa tarifa;

    public Long getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

    public String getFaleMais30() {
        return FaleMais30;
    }

    public void setFaleMais30(String faleMais30) {
        FaleMais30 = faleMais30;
    }

    public String getFaleMais60() {
        return FaleMais60;
    }

    public void setFaleMais60(String faleMais60) {
        FaleMais60 = faleMais60;
    }

    public String getFaleMais90() {
        return FaleMais90;
    }

    public void setFaleMais90(String faleMais90) {
        FaleMais90 = faleMais90;
    }

    public String getFaleMais120() {
        return FaleMais120;
    }

    public void setFaleMais120(String faleMais120) {
        FaleMais120 = faleMais120;
    }
}
