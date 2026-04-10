package com.fatec.atv.Class;

import java.time.LocalDate;

public class Exame extends Procedimento{
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Exame() {}

    public Exame(Consulta consulta, LocalDate data, String descritivo) {
        super(consulta, data, descritivo);
    }

    public void mostrar() {
        System.out.println("Exame:");
        System.out.println("Consulta: " + consulta + " - Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }

    @Override
    public void consultar() {
        System.out.println("Consulta de exame específico");
    }

    public void solicitar() {
        System.out.println("Exame solicitado");
    }
}
