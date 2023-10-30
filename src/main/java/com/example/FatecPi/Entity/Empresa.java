package com.example.FatecPi.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "empresa")
public class Empresa {
    @Id
    private String _id;
    private String CNPJ;
    private String endereco;
    private String numero;
    private String material;

    public Empresa(String _id, String CNPJ, String endereco, String numero, String material) {
        this._id = _id;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.numero = numero;
        this.material = material;
    }

    public  Empresa(){

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "_id='" + _id + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
