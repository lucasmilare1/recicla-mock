package com.reciclaclub.mock.domain.entity;

import javax.persistence.criteria.CriteriaBuilder;

public class Transportador {
    private Integer unidade;
    private String cpfCnpj;

    public Integer getUnidade() {
        return 234556;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public String getCpfCnpj() {
        return "23434456gss3";
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public String toString() {
        return "Transportador{" +
                "unidade=" + unidade +
                ", cpfCnpj=" + cpfCnpj +
                '}';
    }
}
