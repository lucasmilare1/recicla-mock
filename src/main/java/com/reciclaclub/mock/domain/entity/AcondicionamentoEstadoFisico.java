package com.reciclaclub.mock.domain.entity;

public class AcondicionamentoEstadoFisico {
    private Long codigoAcondicionamentoEstadoFisico;
    private String decricaoAcondicionamentoEstadoFisico;

    public Long getCodigoAcondicionamentoEstadoFisico() {
        return codigoAcondicionamentoEstadoFisico;
    }

    public void setCodigoAcondicionamentoEstadoFisico(Long codigoAcondicionamentoEstadoFisico) {
        this.codigoAcondicionamentoEstadoFisico = codigoAcondicionamentoEstadoFisico;
    }

    public String getDecricaoAcondicionamentoEstadoFisico() {
        return decricaoAcondicionamentoEstadoFisico;
    }

    public void setDecricaoAcondicionamentoEstadoFisico(String decricaoAcondicionamentoEstadoFisico) {
        this.decricaoAcondicionamentoEstadoFisico = decricaoAcondicionamentoEstadoFisico;
    }

    @Override
    public String toString() {
        return "AcondicionamentoEstadoFisico{" +
                "codigoAcondicionamentoEstadoFisico=" + codigoAcondicionamentoEstadoFisico +
                ", decricaoAcondicionamentoEstadoFisico='" + decricaoAcondicionamentoEstadoFisico + '\'' +
                '}';
    }
}

