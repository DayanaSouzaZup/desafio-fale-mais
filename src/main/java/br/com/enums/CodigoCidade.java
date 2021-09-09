package br.com.enums;

public enum CodigoCidade {

    SAO_PAULO(11),
    RIBERIRAO_PRETO(16),
    SAO_JOSE_RIO_PRETO(17),
    CAMPINAS(19),
    UBERLANDIA(34),
    BELO_HORIZONTE(31);

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
