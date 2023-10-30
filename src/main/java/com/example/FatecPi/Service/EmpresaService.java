package com.example.FatecPi.Service;

import com.example.FatecPi.Entity.Empresa;
import com.example.FatecPi.Repo.EmpresaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepo repo;
    public void saveorUpdate(Empresa empresa) {
        repo.save(empresa);

    }

    public  Iterable<Empresa> listAll() {
        return this.repo.findAll();

    }

    public void deleteEmpresa(String id) {

        repo.deleteById((id));
    }

    public Empresa getEmpresaById(String empresaid) {

        return repo.findById(empresaid).get();
    }
}


