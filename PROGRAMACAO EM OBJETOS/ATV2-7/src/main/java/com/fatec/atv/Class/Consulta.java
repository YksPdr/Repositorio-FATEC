package com.fatec.atv.Class;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;
    public Agenda agenda;
    public String motivo;
    public String historico;
    private List<Receita> receitas = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();

    public Consulta() {}
    
    public Consulta(LocalDate data, LocalTime hora, Medico medico, Paciente paciente, Agenda agenda, String motivo, String historico) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.agenda = agenda;
        this.motivo = motivo;
        this.historico = historico;
    }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) throws Exception {
        if (data == null) {
            throw new Exception("Data não encontrada.");
        }
        else {
            this.data = data;
        }
    }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) throws Exception {
        if (hora == null) {
            throw new Exception("Horário não encontrado.");
        }
        else {
            this.hora = hora;
        }
    }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) throws Exception {
        if (medico == null) {
            throw new Exception("Médico não encontrado.");
        }
        else {
            this.medico = medico;
        }
    }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) throws Exception {
        if (paciente == null) {
            throw new Exception("Paciente não encontrado.");
        }
        else {
            this.paciente = paciente;
        }
    }

    public Agenda getAgenda() { return agenda; }
    public void setAgenda(Agenda agenda) throws Exception {
        if (agenda == null) {
            throw new Exception("Agenda não encontrada");
        }
        else {
            this.agenda = agenda;
        }
    }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) throws Exception {
        if (motivo == null) {
            throw new Exception("Motivo não encontrado.");
        }
        else {
            this.motivo = motivo;
        }
    }

    public String getHistorico() { return historico; }
    public void setHistorico(String historico) throws Exception {
        if (historico == null) {
            throw new Exception("Histórico não encontrado.");
        }
        else {
            this.historico = historico;
        }
    }

    public List<Receita> getReceitas() { return receitas; }

    public List<Exame> getExames() { return exames; }

    public void marcar() {
        System.out.println("Consulta marcada");
    }

    public void cancelar() {
        System.out.println("Consulta cancelada");
    }

    public void realizar() {
        System.out.println("Consulta realizada pelo médico");
    }

    public void consultar() {
        System.out.println("Consultando consulta do paciente: " + paciente);
    }

    public void atualizar() {
        System.out.println("Consulta atualizada.");
    }
    
    public void mostrar() {
        System.out.println("Consulta: ");
        System.out.println(data + " " + hora + " - " + paciente + " com " + medico);
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public void adicionarExame(Exame exame) {
        exames.add(exame);
        
        try {
            exame.setConsulta(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
