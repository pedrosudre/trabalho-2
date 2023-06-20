package com.example.trabalho2.repository;

import com.example.trabalho2.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotaRepository extends MongoRepository<Nota, Integer> {

    Nota save(Nota nota);
}
