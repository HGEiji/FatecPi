package com.example.FatecPi.Repo;

import com.example.FatecPi.Entity.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepo extends MongoRepository<Empresa, String> {
}
