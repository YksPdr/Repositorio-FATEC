package com.fatec.atv;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getGenero() { return genero; }
    public int getIdade() { return idade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setIdade(int idade) { this.idade = idade; }

    public void cadastrar() {
        System.out.println("Paciente cadastrado com sucesso.");
    }
    public void consultar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade: " + idade);
    }
}
