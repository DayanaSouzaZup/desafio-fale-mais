package br.com.enums;

public enum Plano {

    FALE_MAIS_30(30),
    FALE_MAIS_60(60),
    FALE_MAIS_120(120);

    private int valorPlano;

    Plano(int valorPlano) {
        this.valorPlano = valorPlano;
    }

    public int getValorPlano() {
        return valorPlano;
    }



}
