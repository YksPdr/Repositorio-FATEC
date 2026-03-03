package com.fatec.atv;

public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista() {
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getSenha() { return senha; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setSenha(String senha) { this.senha = senha; }

    
}
