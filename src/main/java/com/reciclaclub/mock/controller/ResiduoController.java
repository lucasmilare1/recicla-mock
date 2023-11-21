package com.reciclaclub.mock.controller;

import com.reciclaclub.mock.domain.entity.*;
import com.reciclaclub.mock.service.RetornaListas;
import com.reciclaclub.mock.service.RetornaManifesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;

@RestController
@RequestMapping("/api/gov-residuo/mtr")
public class ResiduoController {
    @Autowired
    private RetornaListas residuoService;

    @Autowired
    private RetornaManifesto retornoManifesto;

    @GetMapping("/retornaListaClasse")
    public DeferredResult<ResponseEntity<List<ClasseResiduo>>> getClasseResiduos() {
        var dr = new DeferredResult<ResponseEntity<List<ClasseResiduo>>>();
        try {
            var paymentById = residuoService.getClasseResiduos();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }

    @GetMapping("/retornaListaUnidade")
    public DeferredResult<ResponseEntity<List<Unidade>>> getListaUnidades() {
        var dr = new DeferredResult<ResponseEntity<List<Unidade>>>();
        try {
            var paymentById = residuoService.getUnidades();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
    @GetMapping("/retornaListaTratamento")
    public DeferredResult<ResponseEntity<List<Tratamento>>> getListaTratamento() {
        var dr = new DeferredResult<ResponseEntity<List<Tratamento>>>();
        try {
            var paymentById = residuoService.getTratamentos();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
    @GetMapping("/retornaListaEstadoFisico")
    public DeferredResult<ResponseEntity<List<EstadoFisico>>> getListaEstadoFisico() {
        var dr = new DeferredResult<ResponseEntity<List<EstadoFisico>>>();
        try {
            var paymentById = residuoService.getEstadoFisico();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
    @GetMapping("/retornaListaAcondicionamentos")
    public DeferredResult<ResponseEntity<List<Acondicionamentos>>> getListaAcondicionamentos() {
        var dr = new DeferredResult<ResponseEntity<List<Acondicionamentos>>>();
        try {
            var paymentById = residuoService.getAcondicionamentos();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
    @GetMapping("/retornaListaResiduos")
    public DeferredResult<ResponseEntity<List<Residuos>>> getListaResiduos() {
        var dr = new DeferredResult<ResponseEntity<List<Residuos>>>();
        try {
            var paymentById = residuoService.getResiduos();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
    @GetMapping("/retornaListaResiduoPorResiduo")
    public DeferredResult<ResponseEntity<List<ResiduoPorResiduo>>> getListaResiduoPorResiduo() {
        var dr = new DeferredResult<ResponseEntity<List<ResiduoPorResiduo>>>();
        try {
            var paymentById = residuoService.getResiduoPorResiduo();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
    @GetMapping("/retornaListaAcondicionamentoEstadoFisico")
    public DeferredResult<ResponseEntity<List<AcondicionamentoEstadoFisico>>> getAcondicionamentoEstadoFisico() {
        var dr = new DeferredResult<ResponseEntity<List<AcondicionamentoEstadoFisico>>>();
        try {
            var paymentById = residuoService.getAcondicionamentoEstadoFisico();
            dr.setResult(ResponseEntity.ok(paymentById));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }


    @GetMapping("/retornaManifesto")
    public DeferredResult<ResponseEntity<RetornoManifesto>> getRetornoManifesto(@RequestBody ManifestoResiduos manifestoResiduos) {
        var dr = new DeferredResult<ResponseEntity<RetornoManifesto>>();
        try {
            var retornaManifesto = retornoManifesto.validateRequestRetornaManifesto(manifestoResiduos);
            dr.setResult(ResponseEntity.ok(retornaManifesto));
        } catch (Exception e) {
            dr.setErrorResult(ResponseEntity.badRequest().body(e.getMessage()));
        }
        return dr;
    }
}
