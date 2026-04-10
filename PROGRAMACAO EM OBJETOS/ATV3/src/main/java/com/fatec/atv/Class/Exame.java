package com.fatec.atv;

import java.time.LocalDate;

public class Exame {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Exame() {
    }

    public Exame(Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

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
