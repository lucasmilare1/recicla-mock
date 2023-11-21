package com.reciclaclub.mock.domain.entity;

public class Acondicionamentos {
    private Long codigoAcondicionamento;
    private String descricaoAcondicionamento;

    public Long getCodigoAcondicionamento() {
        return codigoAcondicionamento;
    }

    public void setCodigoAcondicionamento(Long codigoAcondicionamento) {
        this.codigoAcondicionamento = codigoAcondicionamento;
    }

    public String getDescricaoAcondicionamento() {
        return descricaoAcondicionamento;
    }

    public void setDescricaoAcondicionamento(String descricaoAcondicionamento) {
        this.descricaoAcondicionamento = descricaoAcondicionamento;
    }

    @Override
    public String toString() {
        return "Acondicionamentos{" +
                "codigoAcondicionamento=" + codigoAcondicionamento +
                ", descricaoAcondicionamento='" + descricaoAcondicionamento + '\'' +
                '}';
    }
}
