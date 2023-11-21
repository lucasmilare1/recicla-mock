package com.reciclaclub.mock.domain.entity;

public class ManifestoResiduos {
    private Double marQuantidade;
    private Long codigoResiduo;
    private Long codigoUnidade;
    private Long codigoTratamento;
    private Long codigoAcondicionamento;
    private Long codigoClasse;
    private Long marDensidade;
    private Long marNumeroONU;
    private Long marClasseRisco;
    private String marNomeEmbarque;
    private String marCodigo;

    public Double getMarQuantidade() {
        return marQuantidade;
    }

    public void setMarQuantidade(Double marQuantidade) {
        this.marQuantidade = marQuantidade;
    }

    public Long getCodigoResiduo() {
        return codigoResiduo;
    }

    public void setCodigoResiduo(Long codigoResiduo) {
        this.codigoResiduo = codigoResiduo;
    }

    public Long getCodigoUnidade() {
        return codigoUnidade;
    }

    public void setCodigoUnidade(Long codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    public Long getCodigoTratamento() {
        return codigoTratamento;
    }

    public void setCodigoTratamento(Long codigoTratamento) {
        this.codigoTratamento = codigoTratamento;
    }

    public Long getCodigoAcondicionamento() {
        return codigoAcondicionamento;
    }

    public void setCodigoAcondicionamento(Long codigoAcondicionamento) {
        this.codigoAcondicionamento = codigoAcondicionamento;
    }

    public Long getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public Long getMarDensidade() {
        return marDensidade;
    }

    public void setMarDensidade(Long marDensidade) {
        this.marDensidade = marDensidade;
    }

    public Long getMarNumeroONU() {
        return marNumeroONU;
    }

    public void setMarNumeroONU(Long marNumeroONU) {
        this.marNumeroONU = marNumeroONU;
    }

    public Long getMarClasseRisco() {
        return marClasseRisco;
    }

    public void setMarClasseRisco(Long marClasseRisco) {
        this.marClasseRisco = marClasseRisco;
    }

    public String getMarNomeEmbarque() {
        return marNomeEmbarque;
    }

    public void setMarNomeEmbarque(String marNomeEmbarque) {
        this.marNomeEmbarque = marNomeEmbarque;
    }

    public String getMarCodigo() {
        return marCodigo;
    }

    public void setMarCodigo(String marCodigo) {
        this.marCodigo = marCodigo;
    }

    @Override
    public String toString() {
        return "ManifestoResiduos_{" +
                "marQuantidade=" + marQuantidade +
                ", codigoResiduo=" + codigoResiduo +
                ", codigoUnidade=" + codigoUnidade +
                ", codigoTratamento=" + codigoTratamento +
                ", codigoAcondicionamento=" + codigoAcondicionamento +
                ", codigoClasse=" + codigoClasse +
                ", marDensidade=" + marDensidade +
                ", marNumeroONU=" + marNumeroONU +
                ", marClasseRisco=" + marClasseRisco +
                ", marNomeEmbarque='" + marNomeEmbarque + '\'' +
                ", marCodigo='" + marCodigo + '\'' +
                '}';
    }
}
