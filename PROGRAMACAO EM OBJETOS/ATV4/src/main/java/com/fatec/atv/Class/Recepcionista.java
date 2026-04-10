package com.fatec.atv;

public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista() {
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        try {
            if (nome == null || cpf == null || telefone == null || senha == null
                || nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || senha.isEmpty()) {
                throw new Exception();
            }
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
            this.cpf = "00000000000";
            this.telefone = "000000000";
            this.senha = "123";
        }
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getSenha() { return senha; }

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
    public void setSenha(String senha) { this.senha = senha; }

    public void mostrar() {
        System.out.println("Recepcionista: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }

    public void acessar() {
        System.out.println("Recepcionista " + nome + " acessou o sistema.");
    }
}
