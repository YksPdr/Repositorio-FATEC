package com.fatec.atv;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta() {
    }
    
    public Consulta(LocalDate data, LocalTime hora, Medico medico, Paciente paciente, String motivo, String historico) {
        try {
            if (data == null || hora == null || medico == null || paciente == null || motivo == null || historico == null) {
                throw new Exception();
            }
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;
            this.motivo = motivo;
            this.historico = historico;
        } catch (Exception e) {
            System.out.println("Exceção encontrada – Valores padrões definidos");
            this.data = LocalDate.now();
            this.hora = LocalTime.of(0, 0);
            this.medico = new Medico();
            this.paciente = new Paciente();
            this.motivo = "Não informado";
            this.historico = "Não informado";
        }
    }

    public LocalDate getData() { return data; }
    public LocalTime getHora() { return hora; }
    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
    public String getMotivo() { return motivo; }
    public String getHistorico() { return historico; }

    public void setData(LocalDate data) {
        try {
            if (data == null) throw new Exception();
            this.data = data;
        } catch (Exception e) {
            System.out.println("Exceção encontrada – Valores padrões definidos");
            this.data = LocalDate.now();
        }
    }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public void setHistorico(String historico) { this.historico = historico; }

    public void mostrar() {
        System.out.println("Consulta: ");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Motivo: " + motivo);
        System.out.println("Historico: " + historico);
    }

    public void marcar() {
        System.out.println("Consulta marcada para " + data + " às " + hora);
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public void realizar() {
        System.out.println("Consulta realizada com sucesso.");
    }

    public void atualizar(String novoMotivo) {
        this.motivo = novoMotivo;
        System.out.println("Motivo atualizado para: " + motivo);
    }

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public void criarReceita(String descricao, String data) {
        Receita r = new Receita(descricao, data);
        receitas.add(r);
    }
    
    public void adicionarExame(Exame exame) {
        exames.add(exame);
    }
}
