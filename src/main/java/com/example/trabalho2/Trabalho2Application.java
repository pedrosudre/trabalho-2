package com.example.trabalho2;

import com.example.trabalho2.model.Aluno;
import com.example.trabalho2.model.Nota;
import com.example.trabalho2.repository.AlunoRepository;
import com.example.trabalho2.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class Trabalho2Application implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Trabalho2Application.class, args);
    }

    @Autowired
    AlunoRepository ar;

    @Autowired
    NotaRepository nr;

    @Override
    public void run(String... args) throws Exception {


        Aluno a1 = new Aluno("10", "Marcos", 15);
        Aluno a2 = new Aluno("20", "João", 17);
        Aluno a3 = new Aluno("30", "Pedro", 21);

        Nota n1 = new Nota("11", a1, "Matematica", Arrays.asList(10, 15, 12));
        Nota n2 = new Nota("21", a2, "Português", Arrays.asList(8, 13, 17));
        Nota n3 = new Nota("31", a3, "Geografia", Arrays.asList(5, 9, 14));

        ar.save(a1);
        ar.save(a2);
        ar.save(a3);

        nr.save(n1);
        nr.save(n2);
        nr.save(n3);


        // 4.1) Buscar todas as notas de um determinado aluno pelo seu nome.
        List<Nota> notasMarcos = nr.findByAlunoId_Id(a1.getId());
        System.out.println("Notas do aluno Marcos: " + notasMarcos);


    }
}
