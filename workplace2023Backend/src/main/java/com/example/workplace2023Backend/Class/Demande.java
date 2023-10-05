package com.example.workplace2023Backend.Class;

import jakarta.persistence.*;

@Entity
public class Demande {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int idDemande;

    String libelle;

    String message;

    boolean resolu;

    boolean accepte;

    int idCategorie;

    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResolu() {
        return resolu;
    }

    public void setResolu(boolean resolu) {
        this.resolu = resolu;
    }

    public boolean isAccepte() {
        return accepte;
    }

    public void setAccepte(boolean accepte) {
        this.accepte = accepte;
    }
}
