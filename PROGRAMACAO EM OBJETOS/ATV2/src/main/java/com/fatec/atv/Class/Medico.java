package com.fatec.atv.Class;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public void acessar() {
        System.out.println("Médico acessando sistema: " + nome);
    }

    public void mostrar() {
        System.out.println("Médico: ");
        System.out.println(nome + ", " + crm + ", " + telefone + ", " + especialidade);
    }
}
