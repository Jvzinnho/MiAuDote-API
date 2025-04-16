package com.miaudote.repository;

import com.miaudote.model.Adotante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdotanteRepository extends MongoRepository<Adotante, String> {
}
