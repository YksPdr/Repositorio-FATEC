package com.fatec.atv;

import java.time.LocalDate;
import java.time.LocalTime;

import main.java.com.fatec.atv.Class.ExceptionClinica;

public class Agenda {
    private LocalDate data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda() {
    }

    public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
        try {
            if (data == null || hora == null || medico == null || paciente == null) {
                throw new Exception();
            }
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data = LocalDate.now();
            this.hora = LocalTime.of(0, 0);
            this.medico = new Medico();
            this.paciente = new Paciente();
        }
    }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) throws ExceptionClinica {
        if (hora == null) {
            System.out.println("Cód: 400. A data não pode ser nula.");
        } else {
            this.hora = hora;
        }
    }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico){ this.medico = medico; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente){ this.paciente = paciente; }

    public void mostrar(){
        System.out.println("Agenda: ");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);
    }
}
