package com.example.FatecPi.Repo;

import com.example.FatecPi.Entity.Ponto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PontoRepo extends MongoRepository<Ponto, String> {
    
}
