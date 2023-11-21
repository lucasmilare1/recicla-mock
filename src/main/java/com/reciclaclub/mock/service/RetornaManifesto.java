package com.reciclaclub.mock.service;

import com.reciclaclub.mock.domain.entity.*;
import com.reciclaclub.mock.domain.exception.FalhaRetornoManifestoException;
import com.reciclaclub.mock.utils.enums.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;
import java.util.Objects;
import java.util.Random;

@Service
public class RetornaManifesto {
    public RetornoManifesto validateRequestRetornaManifesto(ManifestoResiduos manifestoResiduos) throws FalhaRetornoManifestoException {

        if (Objects.nonNull(manifestoResiduos)) {

            RetornoManifesto retirnoManifesto = new RetornoManifesto();
            retirnoManifesto.setRestResponseValido(true);
            retirnoManifesto.setNumeroManifesto(retornaNumeroRamdom());
            retirnoManifesto.setRestResponseMensagem("Validação de campos efetuada com Sucesso!");
            retirnoManifesto.setNomeResponsavel("Kono Anxieta");
            defineTransportador(retirnoManifesto.getTransportador() == null, retirnoManifesto);
            retirnoManifesto.getTransportador().setCpfCnpj("999999999999");
            retirnoManifesto.getTransportador().setUnidade(99999);
            retirnoManifesto.setArmazenadorTemporario("Bombona de plastico");
            retirnoManifesto.setPossuiArmazenamentoTemporario(true);
            retirnoManifesto.setManifestoCodigoEstadual(345234L);
            retirnoManifesto.setManifestoNumeroEstadual(222222L);
            retirnoManifesto.setManifestoNumeroNacional(66666L);
            retirnoManifesto.setNomeMotorista("motoris");
            retirnoManifesto.setPlacaVeiculo("ASD2234");
            retirnoManifesto.setStatus(Status.ATIVO);
            retirnoManifesto.setGerador("gerador");
            retirnoManifesto.setUfOrigemMtr("SP");
            retirnoManifesto.setTipoManifesto("Material Reciclavel");
            retirnoManifesto.setDataExpedicao(System.currentTimeMillis());
            defineDestinador(retirnoManifesto.getDestinador() == null, retirnoManifesto);
            retirnoManifesto.getDestinador().setCpfCnpj("99999999999999");
            retirnoManifesto.getDestinador().setUnidade(99999);
            defineManifesto(retirnoManifesto);
            retirnoManifesto.getManifestoResiduos().setCodigoResiduo(manifestoResiduos.getCodigoResiduo());
            retirnoManifesto.getManifestoResiduos().setCodigoAcondicionamento(manifestoResiduos.getCodigoAcondicionamento());
            retirnoManifesto.getManifestoResiduos().setCodigoUnidade(manifestoResiduos.getCodigoUnidade());
            retirnoManifesto.getManifestoResiduos().setCodigoClasse(manifestoResiduos.getCodigoClasse());
            retirnoManifesto.getManifestoResiduos().setMarClasseRisco(manifestoResiduos.getMarClasseRisco());
            retirnoManifesto.getManifestoResiduos().setMarCodigo(manifestoResiduos.getMarCodigo());
            retirnoManifesto.getManifestoResiduos().setCodigoTratamento(manifestoResiduos.getCodigoTratamento());
            retirnoManifesto.getManifestoResiduos().setMarDensidade(manifestoResiduos.getMarDensidade());
            retirnoManifesto.getManifestoResiduos().setMarNumeroONU(manifestoResiduos.getMarNumeroONU());
            retirnoManifesto.getManifestoResiduos().setMarNomeEmbarque(manifestoResiduos.getMarNomeEmbarque());
            retirnoManifesto.getManifestoResiduos().setMarQuantidade(manifestoResiduos.getMarQuantidade());

            return retirnoManifesto;
        } else {
            throw new FalhaRetornoManifestoException("Erro ao retornar Manifesto");
        }
    }

    private static void defineManifesto(RetornoManifesto respostaMock) {
        if (respostaMock.getManifestoResiduos() == null) {
            var residuos = new ManifestoResiduos();
            respostaMock.setManifestoResiduos(residuos);
        }
    }

    private static void defineTransportador(boolean respostaMock, RetornoManifesto respostaMock1) {
        if (respostaMock) {
            var transp = new Transportador();
            respostaMock1.setTransportador(transp);
        }
    }

    private static void defineDestinador(boolean respostaMock, RetornoManifesto respostaMock1) {
        if (respostaMock) {
            var destinador = new Destinador();
            respostaMock1.setDestinador(destinador);
        }
    }

    private int retornaNumeroRamdom() {
        Random random = new Random();
        int numeroMinimo = (int) Math.pow(11, 6);
        return random.nextInt((int) Math.pow(10, 7 - 6)) + numeroMinimo;
    }

}
