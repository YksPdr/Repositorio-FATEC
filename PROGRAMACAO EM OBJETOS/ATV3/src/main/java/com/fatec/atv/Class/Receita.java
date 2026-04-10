package com.fatec.atv;

import java.time.LocalDate;

public class Receita {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Receita() {
    }

    public Receita(Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public void prescrever() {
        System.out.println("Receita prescrita em " + data);
    }

    public void consultar() {
        System.out.println("Consultando receita.");
    }
    
    public void mostrar() {
        System.out.println("Receita: ");
        System.out.println("Consulta: " + consulta + " - Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}
