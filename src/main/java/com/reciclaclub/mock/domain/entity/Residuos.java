package com.reciclaclub.mock.domain.entity;

public class Residuos {
    private String codigoIbama;
    private String descricaoResiduo;

    public String getCodigoIbama() {
        return codigoIbama;
    }

    public void setCodigoIbama(String codigoIbama) {
        this.codigoIbama = codigoIbama;
    }

    public String getDescricaoResiduo() {
        return descricaoResiduo;
    }

    public void setDescricaoResiduo(String descricaoResiduo) {
        this.descricaoResiduo = descricaoResiduo;
    }

    @Override
    public String toString() {
        return "Residuos{" +
                "codigoIbama='" + codigoIbama + '\'' +
                ", descricaoResiduo='" + descricaoResiduo + '\'' +
                '}';
    }
}
