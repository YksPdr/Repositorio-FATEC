package com.fatec.atv;

public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public Recepcionista() {
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void acessar() {
        System.out.println("Recepcionista acessando sistema: " + nome);
    }

    public void mostrar() {
        System.out.println("Recepcionista: ");
        System.out.println(nome + ", " + cpf + ", " + telefone);
    }
}
