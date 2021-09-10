package br.com.enums;

public enum CodigoCidade {

    SAO_PAULO(11),
    RIBERIRAO_PRETO(16),
    SAO_JOSE_RIO_PRETO(17),
    PRESIDENTE_PRUDENTE(18);

    private int codigoDDD;

    public int getCodigoDDD() {
        return codigoDDD;
    }

    public void setCodigoDDD(int codigoDDD) {
        this.codigoDDD = codigoDDD;
    }

    CodigoCidade(int codigoDDD){
        this.codigoDDD = codigoDDD;
    }

}
