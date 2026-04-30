package com.fatec.atv.Class;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Funcionario{
    public String crm;
    public String especialidade;
    private List<Consulta> consultas = new ArrayList<>();

    public Medico() {}

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        super(nome, telefone, senha);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() { return crm; }
    public void setCrm(String crm) throws Exception {
        if (crm == null) {
            throw new Exception("CRM não encontrado.");
        }
        else {
            this.crm = crm;
        }
    }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) throws Exception {
        if (especialidade == null) {
            throw new Exception("Especialidade não encontrada.");
        }
        else {
            this.especialidade = especialidade;
        }
    }

    public void mostrar() {
        System.out.println("Médico: ");
        System.out.println(nome + ", " + crm + ", " + telefone + ", " + especialidade);
    }

    public void solicitarExame(Consulta consulta, Exame exame) {
        consulta.adicionarExame(exame);
        System.out.println("Exame solicitado.");
    }

    public void adicionarConsulta(Consulta consulta) {
        if (consulta == null) {
            System.out.println("Consulta inválida.");
            return;
        }

        if (!consultas.contains(consulta)) {
            try {
                consultas.add(consulta);
                consulta.setMedico(this);
            } catch (Exception e) {
                System.out.println("Erro ao adicionar consulta");
            }
        }
    }

    @Override
    public void acessar() {
        System.out.println("Acesso de médico: atender consultas");
    }
}
