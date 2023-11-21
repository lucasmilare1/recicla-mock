package com.reciclaclub.mock.service;

import com.reciclaclub.mock.domain.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RetornaListas {

    public List<ClasseResiduo> getClasseResiduos() {
        var classesResiduos = new ArrayList<ClasseResiduo>();

        var classeResiduo1 = new ClasseResiduo();
        classeResiduo1.setCodigoClasseResiduo(11L);
        classeResiduo1.setDescricaoClasseResiduo("CLASSE A (RCC)");
        classesResiduos.add(classeResiduo1);

        var classeResiduo2 = new ClasseResiduo();
        classeResiduo2.setCodigoClasseResiduo(12L);
        classeResiduo2.setDescricaoClasseResiduo("CLASSE B (RCC)");
        classesResiduos.add(classeResiduo2);

        var classeResiduo3 = new ClasseResiduo();
        classeResiduo3.setCodigoClasseResiduo(13L);
        classeResiduo3.setDescricaoClasseResiduo("CLASSE C (RCC)");
        classesResiduos.add(classeResiduo3);

        var classeResiduo4 = new ClasseResiduo();
        classeResiduo4.setCodigoClasseResiduo(14L);
        classeResiduo4.setDescricaoClasseResiduo("CLASSE D (RCC)");
        classesResiduos.add(classeResiduo4);

        return classesResiduos;
    }

    public List<Unidade> getUnidades() {
        var unidades = new ArrayList<Unidade>();

        var unidade1 = new Unidade();
        unidade1.setCodigoUnidade(21L);
        unidade1.setDescricaoUnidade("Litro");
        unidade1.setSiglaUnidade("L");
        unidades.add(unidade1);

        var unidade2 = new Unidade();
        unidade2.setCodigoUnidade(22L);
        unidade2.setDescricaoUnidade("M³");
        unidade2.setSiglaUnidade("M³");
        unidades.add(unidade2);

        var unidade3 = new Unidade();
        unidade3.setCodigoUnidade(23L);
        unidade3.setDescricaoUnidade("Quilograma");
        unidade3.setSiglaUnidade("Kg");
        unidades.add(unidade3);

        var unidade4 = new Unidade();
        unidade4.setCodigoUnidade(24L);
        unidade4.setDescricaoUnidade("Quilograma");
        unidade4.setSiglaUnidade("Kg");
        unidades.add(unidade4);

        var unidade5 = new Unidade();
        unidade5.setCodigoUnidade(25L);
        unidade5.setDescricaoUnidade("Tonelada");
        unidade5.setSiglaUnidade("T");
        unidades.add(unidade5);

        return unidades;
    }

    public List<Tratamento> getTratamentos() {
        var tratamentos = new ArrayList<Tratamento>();

        var tratamento1 = new Tratamento();
        tratamento1.setCodigoTratamento(1L);
        tratamento1.setDescricaoTratamento("Aterro Resíduos Classe I");
        tratamentos.add(tratamento1);

        var tratamento2 = new Tratamento();
        tratamento2.setCodigoTratamento(2L);
        tratamento2.setDescricaoTratamento("Aterro Resíduos Classes IIA e IIB");
        tratamentos.add(tratamento2);

        return tratamentos;
    }

    public List<EstadoFisico> getEstadoFisico() {
        var estadosFisicos = new ArrayList<EstadoFisico>();

        var estadoFisico1 = new EstadoFisico();
        estadoFisico1.setCodigoEstadoFisico(1L);
        estadoFisico1.setDescricaoEstadoFisico("Solido");
        estadosFisicos.add(estadoFisico1);

        var estadoFisico2 = new EstadoFisico();
        estadoFisico2.setCodigoEstadoFisico(2L);
        estadoFisico2.setDescricaoEstadoFisico("Liquido");
        estadosFisicos.add(estadoFisico2);

        var estadoFisico3 = new EstadoFisico();
        estadoFisico3.setCodigoEstadoFisico(3L);
        estadoFisico3.setDescricaoEstadoFisico("Gasoso");
        estadosFisicos.add(estadoFisico3);

        return estadosFisicos;
    }


    public List<Acondicionamentos> getAcondicionamentos() {
        var acondicionamentos = new ArrayList<Acondicionamentos>();

        var acondicionamento1 = new Acondicionamentos();
        acondicionamento1.setCodigoAcondicionamento(3L);
        acondicionamento1.setDescricaoAcondicionamento("Conteiner");
        acondicionamentos.add(acondicionamento1);

        var acondicionamento2 = new Acondicionamentos();
        acondicionamento2.setCodigoAcondicionamento(4L);
        acondicionamento2.setDescricaoAcondicionamento("Cacamba aberta");
        acondicionamentos.add(acondicionamento2);

        var acondicionamento3 = new Acondicionamentos();
        acondicionamento3.setCodigoAcondicionamento(5L);
        acondicionamento3.setDescricaoAcondicionamento("Bombona");
        acondicionamentos.add(acondicionamento3);

        return acondicionamentos;
    }

    public List<Residuos> getResiduos() {
        var residuos = new ArrayList<Residuos>();

        var residuo = new Residuos();
        residuo.setCodigoIbama("060102(*)");
        residuo.setDescricaoResiduo("Acido Nitrico");
        residuos.add(residuo);

        var residuo2 = new Residuos();
        residuo2.setCodigoIbama("060103(*)");
        residuo2.setDescricaoResiduo("Acido Sulfurico");
        residuos.add(residuo2);

        var residuos3 = new Residuos();
        residuos3.setCodigoIbama("060104(*)");
        residuos3.setDescricaoResiduo("Aluminio");
        residuos.add(residuos3);

        var residuos4 = new Residuos();
        residuos4.setCodigoIbama("060105(*)");
        residuos4.setDescricaoResiduo("madeira");
        residuos.add(residuos4);

        var residuos5 = new Residuos();
        residuos5.setCodigoIbama("060106(*)");
        residuos5.setDescricaoResiduo("Cianeto de Hidrogenio");
        residuos.add(residuos5);

        return residuos;
    }

    public List<ResiduoPorResiduo> getResiduoPorResiduo() {
        var residuoPorResiduos = new ArrayList<ResiduoPorResiduo>();

        var residuoPorResiduo = new ResiduoPorResiduo();
        residuoPorResiduo.setCodigo(1L);
        residuoPorResiduo.setDescricao("CLASSE I");
        residuoPorResiduos.add(residuoPorResiduo);

        var residuoPorResiduo2 = new ResiduoPorResiduo();
        residuoPorResiduo2.setCodigo(23L);
        residuoPorResiduo2.setDescricao("GRUPO A1 (RSS)");
        residuoPorResiduos.add(residuoPorResiduo2);

        var residuoPorResiduo3 = new ResiduoPorResiduo();
        residuoPorResiduo3.setCodigo(15L);
        residuoPorResiduo3.setDescricao("GRUPO A5 (RSS)");
        residuoPorResiduos.add(residuoPorResiduo3);

        return residuoPorResiduos;
    }

    public List<AcondicionamentoEstadoFisico> getAcondicionamentoEstadoFisico() {
        var acondicionamentoPorEstadosFisicos = new ArrayList<AcondicionamentoEstadoFisico>();

        var acondicionamentoPorEstadoFisico = new AcondicionamentoEstadoFisico();
        acondicionamentoPorEstadoFisico.setCodigoAcondicionamentoEstadoFisico(2L);
        acondicionamentoPorEstadoFisico.setDecricaoAcondicionamentoEstadoFisico("grouler de vidro");
        acondicionamentoPorEstadosFisicos.add(acondicionamentoPorEstadoFisico);

        var acondicionamentoPorEstadoFisico2 = new AcondicionamentoEstadoFisico();
        acondicionamentoPorEstadoFisico2.setCodigoAcondicionamentoEstadoFisico(22L);
        acondicionamentoPorEstadoFisico2.setDecricaoAcondicionamentoEstadoFisico("Bombona de plastico");
        acondicionamentoPorEstadosFisicos.add(acondicionamentoPorEstadoFisico2);

        var acondicionamentoPorEstadoFisico3 = new AcondicionamentoEstadoFisico();
        acondicionamentoPorEstadoFisico3.setCodigoAcondicionamentoEstadoFisico(12L);
        acondicionamentoPorEstadoFisico3.setDecricaoAcondicionamentoEstadoFisico("tonel de metal");
        acondicionamentoPorEstadosFisicos.add(acondicionamentoPorEstadoFisico3);

        return acondicionamentoPorEstadosFisicos;
    }


}

