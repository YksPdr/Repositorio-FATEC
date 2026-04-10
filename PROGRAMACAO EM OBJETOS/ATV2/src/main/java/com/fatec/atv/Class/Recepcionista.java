package com.fatec.atv.Class;

public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public void acessar() {
        System.out.println("Recepcionista acessando sistema: " + nome);
    }

    public void mostrar() {
        System.out.println("Recepcionista: ");
        System.out.println(nome + ", " + cpf + ", " + telefone);
    }
}
