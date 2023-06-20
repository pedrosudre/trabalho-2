package com.example.trabalho2;

import com.example.trabalho2.model.Aluno;
import com.example.trabalho2.model.Nota;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Trabalho2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Trabalho2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Aluno a1 = new Aluno("10", "Marcos", 15);
        Nota n1 = new Nota("11", a1, "Matematica", 10);

        Aluno a2 = new Aluno("20", "João", 17);
        Nota n2 = new Nota("21", a2, "Português", 8);

        Aluno a3 = new Aluno("30", "Pedro", 21);
        Nota n3 = new Nota("31", a3, "Geografia", 5);
    }
}
