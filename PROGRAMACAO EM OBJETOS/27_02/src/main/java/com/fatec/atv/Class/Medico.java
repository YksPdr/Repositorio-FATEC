package com.fatec.atv;

public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico() {
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getCrm() { return crm; }
    public String getTelefone() { return telefone; }
    public String getEspecialidade() { return especialidade; }
    public String getSenha() { return senha; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCrm(String crm) { this.crm = crm; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public void setSenha(String senha) { this.senha = senha; }

    public void mostrar() {
        System.out.println("Medico: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
    }
    
    public void acessar() {
        System.out.println("Login efetuado. Médico: " + nome + " | CRM: " + crm);
    }
}
