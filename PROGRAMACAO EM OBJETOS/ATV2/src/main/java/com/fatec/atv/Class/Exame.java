package com.fatec.atv.Class;

import java.time.LocalDate;

public class Exame {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public void solicitar() {
        System.out.println("Exame solicitado em " + data);
    }

    public void consultar() {
        System.out.println("Consultando exame");
    }

    public void mostrar() {
        System.out.println("Exame:");
        System.out.println("Consulta: " + consulta + " - Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}
