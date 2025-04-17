package com.miaudote.repository;

import com.miaudote.model.Adocao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdocaoRepository extends MongoRepository<Adocao, String> {
}
