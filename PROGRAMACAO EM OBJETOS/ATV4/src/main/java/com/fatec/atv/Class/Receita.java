package com.fatec.atv;

import java.time.LocalDate;

public class Receita {
    private Consulta consulta;
    private LocalDate data;
    private String descritivo;

    public Receita() {
    }

    public Receita(Consulta consulta, LocalDate data, String descritivo) {
        try {
            if (consulta == null || data == null || descritivo == null || descritivo.isEmpty()) {
                throw new Exception();
            }
            this.consulta = consulta;
            this.data = data;
            this.descritivo = descritivo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.consulta = new Consulta();
            this.data = LocalDate.now();
            this.descritivo = "Não informado";
        }
    }

    public Consulta getConsulta() { return consulta; }
    public LocalDate getData() { return data; }
    public String getDescritivo() { return descritivo; }

    public void setConsulta(Consulta consulta) {
        try {
            if (consulta == null) throw new Exception();
            this.consulta = consulta;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.consulta = new Consulta();
        }
    }
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
