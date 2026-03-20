package com.fatec.atv.Class;

import java.time.LocalDate;

public class Exame {
    private Consulta consulta;
    private LocalDate data;
    private String descritivo;

    public Exame() {
    }

    public Exame(Consulta consulta, LocalDate data, String descritivo) {
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
        System.out.println("Exame: ");
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descricao: " + descritivo);
    }

    public void solicitar() {
        System.out.println("Exame solicitado em " + data);
    }
}
