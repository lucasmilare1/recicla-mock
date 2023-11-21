package com.reciclaclub.mock.domain.entity;

public class Tratamento {
    private Long codigoTratamento;
    private String descricaoTratamento;

    public Long getCodigoTratamento() {
        return codigoTratamento;
    }

    public void setCodigoTratamento(Long codigoTratamento) {
        this.codigoTratamento = codigoTratamento;
    }

    public String getDescricaoTratamento() {
        return descricaoTratamento;
    }

    public void setDescricaoTratamento(String descricaoTratamento) {
        this.descricaoTratamento = descricaoTratamento;
    }

    @Override
    public String toString() {
        return "Tratamento{" +
                "codigoTratamento=" + codigoTratamento +
                ", descricaoTratamento='" + descricaoTratamento + '\'' +
                '}';
    }
}
