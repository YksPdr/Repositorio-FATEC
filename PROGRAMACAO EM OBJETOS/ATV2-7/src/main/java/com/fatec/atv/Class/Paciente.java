package com.fatec.atv.Class;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public Paciente() {}

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nome não encontrado.");
        }
        else {
            this.nome = nome;
        }
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) throws Exception {
        if (cpf == null) {
            throw new Exception("CPF não encontrado.");
        }
        else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) throws Exception {
        if (telefone == null) {
            throw new Exception("Telefone não encontrado.");
        }
        else {
            this.telefone = telefone;
        }
    }

    public String getGenero() { return genero; }
    public void setGenero(String genero) throws Exception {
        if (genero == null) {
            throw new Exception("Gênero não encontrado.");
        }
        else {
            this.genero = genero;
        }
    }

    public int getIdade() { return idade; }
    public void setIdade(int idade) throws Exception {
        if (idade == 0 || idade < 0) {
            throw new Exception("Idade inválida.");
        }
        else {
            this.idade = idade;
        }
    }

    public void cadastrar() {
        System.out.println("Paciente cadastrado: " + nome);
    }

    public void consultar() {
        System.out.println("Consultando paciente: " + nome);
    }

    public void mostrar() {
        System.out.println("Paciente: ");
        System.out.println(nome + ", " + cpf + ", " + telefone + ", " + genero + ", " + idade);
    }
}
