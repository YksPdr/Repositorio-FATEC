package com.fatec.atv;

import java.time.LocalDate;

public class Receita {
    private Consulta consulta;
    private LocalDate data;
    private String descritivo;

    public Receita() {
    }

    public Receita(Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Consulta getConsulta() { return consulta; }
    public LocalDate getData() { return data; }
    public String getDescritivo() { return descritivo; }

    public void setConsulta(Consulta consulta) { this.consulta = consulta; }
    public void setData(LocalDate data) { this.data = data; }
    public void setDescritivo(String descritivo) { this.descritivo = descritivo; }

    public void mostrar() {
        System.out.println("Receita: ");
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }

    public void prescrever() {
        System.out.println("Receita emitida em " + data);
    }
}
