package com.reciclaclub.mock.domain.entity;

public class EstadoFisico {
    private  Long codigoEstadoFisico;
    private  String descricaoEstadoFisico;

    public Long getCodigoEstadoFisico() {
        return codigoEstadoFisico;
    }

    public void setCodigoEstadoFisico(Long codigoEstadoFisico) {
        this.codigoEstadoFisico = codigoEstadoFisico;
    }

    public String getDescricaoEstadoFisico() {
        return descricaoEstadoFisico;
    }

    public void setDescricaoEstadoFisico(String descricaoEstadoFisico) {
        this.descricaoEstadoFisico = descricaoEstadoFisico;
    }

    @Override
    public String toString() {
        return "EstadoFisico{" +
                "codigoEstadoFisico=" + codigoEstadoFisico +
                ", descricaoEstadoFisico='" + descricaoEstadoFisico + '\'' +
                '}';
    }
}
