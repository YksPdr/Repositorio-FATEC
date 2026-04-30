package com.fatec.atv.Class;

import java.time.LocalDate;

public class Procedimento {
    protected Consulta consulta;
    protected LocalDate data;
    protected String descritivo;

    public Procedimento() {}

    public Procedimento(Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Consulta getConsulta() { return consulta; }
    public void setConsulta(Consulta consulta) throws Exception {
        if (consulta == null) {
            System.out.println("Consulta não encontrada.");
        }
        else {
            this.consulta = consulta;
        }
    }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) throws Exception {
        if (data == null) {
            System.out.println("Data não encontrada.");
        }
        else {
            this.data = data;
        }
    }

    public String getDescritivo() { return descritivo; }
    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo == null) {
            System.out.println("Descritivo não encontrado.");
        }
        else {
            this.descritivo = descritivo;
        }
    }
}
