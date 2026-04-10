package com.fatec.atv.Class;

public class Funcionario {
    protected String nome;
    protected String telefone;
    protected String senha;

    public Funcionario () {}

    public Funcionario (String nome, String telefone, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
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

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) throws Exception {
        if (telefone == null) {
            throw new Exception("Telefone não encontrado.");
        }
        else {
            this.telefone = telefone;
        }
    }

    public String getSenha() { return senha; }
    public void setSenha(String senha) throws Exception {
        if (senha == null) {
            throw new Exception("Senha não encontrada.");
        }
        else {
            this.senha = senha;
        }
    }
    
    public void acessar() {
        System.out.println("Funcionário acessando o sistema: " + nome);
    }
}
