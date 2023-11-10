package com.example.FatecPi.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "ponto")
public class Ponto {
    @Id
    private String _id;
    private String nomePonto;
    private String enderecoPonto;
    private String materialPonto;
    //private byte[] imagemPonto;
    private String emailPonto;

    public Ponto(String _id, String nomePonto,String enderecoPonto, String materialPonto, String emailPonto){
        this._id = _id;
        this.nomePonto = nomePonto;
        this.enderecoPonto = enderecoPonto;
        this.materialPonto = materialPonto;
       // this.imagemPonto = imagemPonto;
        this.emailPonto = emailPonto;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomePonto() {
        return nomePonto;
    }

    public void setNomePonto(String nomePonto) {
        this.nomePonto = nomePonto;
    }

    public String getEnderecoPonto() {
        return enderecoPonto;
    }

    public void setEnderecoPonto(String enderecoPonto) {
        this.enderecoPonto = enderecoPonto;
    }

    public String getMaterialPonto() {
        return materialPonto;
    }

    public void setMaterialPonto(String materialPonto) {
        this.materialPonto = materialPonto;
    }

   // public byte[] getImagemPonto() {
   //     return imagemPonto;
   // }

   /* public void setImagemPonto(byte[] imagemPonto) {
        this.imagemPonto = imagemPonto;
    }*/

    public String getEmailPonto() {
        return emailPonto;
    }

    public void setEmailPonto(String emailPonto) {
        this.emailPonto = emailPonto;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "_id='" + _id + '\'' +
                ", nomePonto='" + nomePonto + '\'' +
                ", enderecoPonto='" + enderecoPonto + '\'' +
                ", materialPonto='" + materialPonto + '\'' +
               // ", imagemPonto=" + Arrays.toString(imagemPonto) +
                ", emailPonto='" + emailPonto + '\'' +
                '}';
    }
}
