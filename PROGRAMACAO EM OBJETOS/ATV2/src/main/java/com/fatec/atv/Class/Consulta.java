package com.fatec.atv.Class;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;
    public String motivo;
    public String historico;

    public void marcar() {
        System.out.println("Consulta marcada para " + data + " às " + hora);
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public void consultar() {
        System.out.println("Consultando consulta do paciente: " + paciente);
    }

    public void realizar() {
        System.out.println("Consulta realizada.");
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
}
