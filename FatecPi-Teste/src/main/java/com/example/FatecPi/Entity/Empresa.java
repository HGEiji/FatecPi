package com.example.FatecPi.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "empresa")
public class Empresa {
    @Id
    private String _id;
    private String CNPJ;
    private String endereco;
    private String numero;
    private List<String> material;

    private String email;

    public Empresa(String _id, String CNPJ, String endereco, String numero, List<String> material, String email) {
        this._id = _id;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.numero = numero;
        this.material = material;
        this.email = email;
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getMaterial() {
        return material;
    }

    public void setMaterial(List<String> material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "_id='" + _id + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", material=" + material +
                ", email='" + email + '\'' +
                '}';
    }
}
