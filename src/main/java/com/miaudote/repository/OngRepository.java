package com.miaudote.repository;

import com.miaudote.model.Ong;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OngRepository extends MongoRepository<Ong, String> {
}
