package com.reciclaclub.mock.domain.entity;

public class Unidade {
    private Long codigoUnidade;
    private String descricaoUnidade;
    private String siglaUnidade;


    public Long getCodigoUnidade() {
        return codigoUnidade;
    }

    public void setCodigoUnidade(Long codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    public String getDescricaoUnidade() {
        return descricaoUnidade;
    }

    public void setDescricaoUnidade(String descricaoUnidade) {
        this.descricaoUnidade = descricaoUnidade;
    }

    public String getSiglaUnidade() {
        return siglaUnidade;
    }

    public void setSiglaUnidade(String siglaUnidade) {
        this.siglaUnidade = siglaUnidade;
    }

    @Override
    public String toString() {
        return "Unidade{" +
                "codigoUnidade=" + codigoUnidade +
                ", descricaoUnidade='" + descricaoUnidade + '\'' +
                ", siglaUnidade='" + siglaUnidade + '\'' +
                '}';
    }
}
