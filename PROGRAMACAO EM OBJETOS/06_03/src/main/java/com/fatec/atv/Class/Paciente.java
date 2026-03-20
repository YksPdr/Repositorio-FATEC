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
        try {
            if (nome == null || cpf == null || telefone == null || genero == null
                || nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || genero.isEmpty()
                || idade < 0) {
                throw new Exception();
            }
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.genero = genero;
            this.idade = idade;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
            this.cpf = "00000000000";
            this.telefone = "000000000";
            this.genero = "Não informado";
            this.idade = 0;
        }
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getGenero() { return genero; }
    public int getIdade() { return idade; }

    public void setNome(String nome) {
        try {
            if (nome == null || nome.isEmpty()) throw new Exception();
            this.nome = nome;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
        }
    }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setIdade(int idade) { this.idade = idade; }

    public void mostrar() {
        System.out.println("Paciente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Genero: " + genero);
        System.out.println("Idade: " + idade);
    }

    public void cadastrar() {
        System.out.println("Paciente cadastrado com sucesso.");
    }
}
