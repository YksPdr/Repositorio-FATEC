package main.java.com.fatec.atv.Class;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
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
