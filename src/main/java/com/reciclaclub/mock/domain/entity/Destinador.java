package com.reciclaclub.mock.domain.entity;

public class Destinador {
    private Integer unidade;
    private String cpfCnpj;

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public String toString() {
        return "Destinador{" +
                "unidade=" + unidade +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                '}';
    }
}
