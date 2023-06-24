package com.example.trabalho2.repository;

import com.example.trabalho2.model.Aluno;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, String>{

    Aluno save(Aluno aluno);
}
