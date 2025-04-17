package com.miaudote.repository;

import com.miaudote.model.FormularioAdocao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormularioRepository extends MongoRepository<FormularioAdocao, String> {
}
