package com.example.trabalho2.repository;

import com.example.trabalho2.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotaRepository extends MongoRepository<Nota, Integer> {

    List<Nota> findByAlunoId_Id(String alunoId);
    Nota save(Nota nota);
}
