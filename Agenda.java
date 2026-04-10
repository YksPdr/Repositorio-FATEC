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

    public void consultar() {
        System.out.println("Consultando agenda em " + data + " às " + hora);
    }

    public void mostrar() {
        System.out.println("Agenda: ");
        System.out.println(data + " " + hora + " - Medico: " + medico + " - Paciente: " + paciente);
    }
}
