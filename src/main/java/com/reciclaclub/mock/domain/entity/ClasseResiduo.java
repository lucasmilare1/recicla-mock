package com.reciclaclub.mock.domain.entity;


public class ClasseResiduo {
    private Long codigoClasseResiduo;
    private String descricaoClasseResiduo;

    public Long getCodigoClasseResiduo() {
        return codigoClasseResiduo;
    }

    public void setCodigoClasseResiduo(Long codigoClasseResiduo) {
        this.codigoClasseResiduo = codigoClasseResiduo;
    }

    public String getDescricaoClasseResiduo() {
        return descricaoClasseResiduo;
    }

    public void setDescricaoClasseResiduo(String descricaoClasseResiduo) {
        this.descricaoClasseResiduo = descricaoClasseResiduo;
    }

    @Override
    public String toString() {
        return "ClasseResiduo{" +
                "codigoClasseResiduo=" + codigoClasseResiduo +
                ", descricaoClasseResiduo='" + descricaoClasseResiduo + '\'' +
                '}';
    }
}
