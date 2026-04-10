package com.fatec.atv;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;

    public Agenda() {
    }

    public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDate getData() { return data; }
    public LocalTime getHora() { return hora; }
    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }

    public void setData(LocalDate data) { this.data = data; }
    public void setHora(LocalTime hora) {
        try {
            if (hora == null) {
                throw new Exception();
            }
            this.hora = hora;
        } catch (Exception e) {
            System.out.println("Exceção encontrada – Valores padrões definidos");
            this.hora = LocalTime.of(0, 0);
        }
    }
    public void setMedico(Medico medico){ this.medico = medico; }
    public void setPaciente(Paciente paciente){ this.paciente = paciente; }

    public void mostrar(){
        System.out.println("Agenda: ");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);
    }
}
