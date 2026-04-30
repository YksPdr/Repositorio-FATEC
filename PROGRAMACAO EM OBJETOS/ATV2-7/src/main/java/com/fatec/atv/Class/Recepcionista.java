package com.fatec.atv.Class;

public class Recepcionista extends Funcionario{
    public String cpf;

    public Recepcionista() {}

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        super(nome, telefone, senha);
        this.cpf = cpf;
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

    public void mostrar() {
        System.out.println("Recepcionista: ");
        System.out.println(nome + ", " + cpf + ", " + telefone);
    }

    public void cadastrarPaciente(Paciente paciente) throws Exception {
        System.out.println("Paciente cadastrado: " + paciente.getNome());
    }

    public Paciente consultarPaciente(String cpf) throws Exception {
        System.out.println("Consultando paciente com CPF: " + cpf);

        return null;
    }

    @Override
    public void acessar() {
        System.out.println("Acesso de recepcionista: gerenciar agenda e pacientes");
    }

    public void marcarConsulta() {
        System.out.println("Consulta marcada pelo recepcionista");
    }
}
