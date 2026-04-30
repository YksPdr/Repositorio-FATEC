package com.fatec.atv.Class;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;
    private List<Consulta> consultas = new ArrayList<>();

    public Agenda() {}

    public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.consultas = new ArrayList<>();
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

    public List<Consulta> getConsultas() { return consultas; }

    public void consultar() {
        System.out.println("Consultando agenda em " + data + " às " + hora);
    }

    public void mostrar() {
        System.out.println("Agenda: ");
        System.out.println(data + " " + hora + " - Medico: " + medico + " - Paciente: " + paciente);
    }

    public void adicionarConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }
}
