package com.fatec.atv;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fatec.atv.Class.Agenda;
import com.fatec.atv.Class.Consulta;
import com.fatec.atv.Class.Exame;
import com.fatec.atv.Class.Medico;
import com.fatec.atv.Class.Paciente;
import com.fatec.atv.Class.Receita;
import com.fatec.atv.Class.Recepcionista;

public class App 
{
    public static void main( String[] args )
    {
        Paciente p = new Paciente();
        p.nome = "Joao";
        p.cpf = "123456789";
        p.telefone = "99999-9999";
        p.genero = "Masculino";
        p.idade = 30;

        Medico m = new Medico();
        m.crm = "12345";
        m.especialidade = "Cardiologia";

        Recepcionista r = new Recepcionista();
        r.cpf = "987654321";

        Agenda a = new Agenda();
        a.data = LocalDate.of(2025, 10, 10);
        a.hora = LocalTime.of(10, 0);
        a.medico = m;
        a.paciente = p;

        Consulta c = new Consulta();
        c.data = LocalDate.of(2025, 10, 10);
        c.hora = LocalTime.of(10, 0);
        c.medico = m;
        c.paciente = p;
        c.motivo = "Consulta de rotina";
        c.historico = "Sem histórico";

        Receita rec = new Receita();
        rec.consulta = c;
        rec.data = LocalDate.of(2025, 10, 10);
        rec.descritivo = "Tomar remedio X";

        Exame e = new Exame();
        e.consulta = c;
        e.data = LocalDate.of(2025, 10, 10);
        e.descritivo = "Exame de sangue";

        p.mostrar();
        m.mostrar();
        r.mostrar();
        a.mostrar();
        c.mostrar();
        rec.mostrar();
        e.mostrar();
    }
}
