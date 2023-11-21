package com.reciclaclub.mock.domain.entity;

import java.util.List;

public class RespostaApiManifesto {
    private boolean restResponseValido;
    private String restResponseMensagem;
    private int codigoGerado;
    private Integer manifestoCodigoEstadual;
    private Integer manifestoNumeroEstadual;
    private long manifestoNumeroNacional;
    private Boolean possuiArmazenamentoTemporario;
    private String armazenadorTemporario;
    private String nomeResponsavel;
    private Transportador transportador;
    private String nomeMotorista;
    private String placaVeiculo;
    private long dataExpedicao;
    private Destinador destinador;
    private String gerador;
    private String ufOrigemMtr;
    private String tipoManifesto;
    private String observacoes;
    private List<ManifestoResiduos> listaManifestoResiduos;

}
