package com.reciclaclub.mock.domain.entity;

import com.reciclaclub.mock.utils.enums.Status;

import java.util.StringJoiner;

public class RetornoManifesto {
    private boolean restResponseValido;
    private int numeroManifesto;
    private String restResponseMensagem;
    private int codigoGerado;
    private Long manifestoCodigoEstadual;
    private Long manifestoNumeroEstadual;
    private Long manifestoNumeroNacional;
    private Boolean possuiArmazenamentoTemporario;
    private String armazenadorTemporario;
    private String nomeResponsavel;
    private Transportador transportador;
    private String nomeMotorista;
    private Status status;
    private String placaVeiculo;
    private Long dataExpedicao;
    private Destinador destinador;
    private String gerador;
    private String ufOrigemMtr;
    private String tipoManifesto;
    private String observacoes;
    private ManifestoResiduos listaManifestoResiduos;


    public int getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(int numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isRestResponseValido() {
        return restResponseValido;
    }

    public void setRestResponseValido(boolean restResponseValido) {
        this.restResponseValido = restResponseValido;
    }

    public String getRestResponseMensagem() {
        return restResponseMensagem;
    }

    public void setRestResponseMensagem(String restResponseMensagem) {
        this.restResponseMensagem = restResponseMensagem;
    }

    public int getCodigoGerado() {
        return codigoGerado;
    }

    public void setCodigoGerado(int codigoGerado) {
        this.codigoGerado = codigoGerado;
    }

    public Long getManifestoCodigoEstadual() {
        return manifestoCodigoEstadual;
    }

    public void setManifestoCodigoEstadual(Long manifestoCodigoEstadual) {
        this.manifestoCodigoEstadual = manifestoCodigoEstadual;
    }

    public Long getManifestoNumeroEstadual() {
        return manifestoNumeroEstadual;
    }

    public void setManifestoNumeroEstadual(Long manifestoNumeroEstadual) {
        this.manifestoNumeroEstadual = manifestoNumeroEstadual;
    }

    public Long getManifestoNumeroNacional() {
        return manifestoNumeroNacional;
    }

    public void setManifestoNumeroNacional(Long manifestoNumeroNacional) {
        this.manifestoNumeroNacional = manifestoNumeroNacional;
    }

    public Boolean getPossuiArmazenamentoTemporario() {
        return possuiArmazenamentoTemporario;
    }

    public void setPossuiArmazenamentoTemporario(Boolean possuiArmazenamentoTemporario) {
        this.possuiArmazenamentoTemporario = possuiArmazenamentoTemporario;
    }

    public String getArmazenadorTemporario() {
        return armazenadorTemporario;
    }

    public void setArmazenadorTemporario(String armazenadorTemporario) {
        this.armazenadorTemporario = armazenadorTemporario;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Transportador getTransportador() {
        return transportador;
    }

    public void setTransportador(Transportador transportador) {
        this.transportador = transportador;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Long getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Long dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public Destinador getDestinador() {
        return destinador;
    }

    public void setDestinador(Destinador destinador) {
        this.destinador = destinador;
    }

    public String getGerador() {
        return gerador;
    }

    public void setGerador(String gerador) {
        this.gerador = gerador;
    }

    public String getUfOrigemMtr() {
        return ufOrigemMtr;
    }

    public void setUfOrigemMtr(String ufOrigemMtr) {
        this.ufOrigemMtr = ufOrigemMtr;
    }

    public String getTipoManifesto() {
        return tipoManifesto;
    }

    public void setTipoManifesto(String tipoManifesto) {
        this.tipoManifesto = tipoManifesto;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public ManifestoResiduos getManifestoResiduos() {
        return listaManifestoResiduos;
    }

    public void setManifestoResiduos(ManifestoResiduos listaManifestoResiduos) {
        this.listaManifestoResiduos = listaManifestoResiduos;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RetornoManifesto.class.getSimpleName() + "[", "]")
                .add("restResponseValido=" + restResponseValido)
                .add("numeroManifesto=" + numeroManifesto)
                .add("restResponseMensagem='" + restResponseMensagem + "'")
                .add("codigoGerado=" + codigoGerado)
                .add("manifestoCodigoEstadual=" + manifestoCodigoEstadual)
                .add("manifestoNumeroEstadual=" + manifestoNumeroEstadual)
                .add("manifestoNumeroNacional=" + manifestoNumeroNacional)
                .add("possuiArmazenamentoTemporario=" + possuiArmazenamentoTemporario)
                .add("armazenadorTemporario='" + armazenadorTemporario + "'")
                .add("nomeResponsavel='" + nomeResponsavel + "'")
                .add("transportador=" + transportador)
                .add("nomeMotorista='" + nomeMotorista + "'")
                .add("status=" + status)
                .add("placaVeiculo='" + placaVeiculo + "'")
                .add("dataExpedicao=" + dataExpedicao)
                .add("destinador=" + destinador)
                .add("gerador='" + gerador + "'")
                .add("ufOrigemMtr='" + ufOrigemMtr + "'")
                .add("tipoManifesto='" + tipoManifesto + "'")
                .add("observacoes='" + observacoes + "'")
                .add("listaManifestoResiduos=" + listaManifestoResiduos)
                .toString();
    }
}
