package com.example.FatecPi.Service;

import com.example.FatecPi.Entity.Empresa;
import com.example.FatecPi.Entity.Ponto;
import com.example.FatecPi.Repo.PontoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PontoService {

    @Autowired
    private PontoRepo pontoRepo;

    public boolean saveorUpdatePonto(Ponto ponto) {
        try {
            pontoRepo.save(ponto);
            return true; // Cadastro bem-sucedido
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Falha no cadastro
        }
    }

    public Iterable<Ponto> listAll() {
        return this.pontoRepo.findAll();
    }


}