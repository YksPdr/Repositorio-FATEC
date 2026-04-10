package com.fatec.atv;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public Medico() {
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    public void acessar() {
        System.out.println("Médico acessando sistema: " + nome);
    }

    public void mostrar() {
        System.out.println("Médico: ");
        System.out.println(nome + ", " + crm + ", " + telefone + ", " + especialidade);
    }
}
