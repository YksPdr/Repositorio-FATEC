package com.fatec.atv.Class;

import java.time.LocalDate;

public class Receita extends Procedimento{
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Receita() {}

    public Receita(Consulta consulta, LocalDate data, String descritivo) {
        super(consulta, data, descritivo);
    }

    public void prescrever() {
        System.out.println("Receita prescrita pelo médico");
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
