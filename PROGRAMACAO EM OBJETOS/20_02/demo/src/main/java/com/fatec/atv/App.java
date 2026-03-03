package com.fatec.atv;

public class App 
{
    public static void main( String[] args )
    {
        Paciente p = new Paciente("Pedro", "12345678900", "119999999", "Masculino", 20);

        p.cadastrar();
        p.consultar();
    }
}
