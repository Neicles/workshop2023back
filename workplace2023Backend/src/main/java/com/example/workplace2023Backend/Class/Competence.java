package com.example.workplace2023Backend.Class;

import jakarta.persistence.*;

@Entity
public class Competence {

    @Id
    public int getIdCompetence() {
        return idCompetence;
    }

    public void setIdCompetence(int idCompetence) {
        this.idCompetence = idCompetence;
    }

    public String getLibelleCompetence() {
        return libelleCompetence;
    }

    public void setLibelleCompetence(String libelleCompetence) {
        this.libelleCompetence = libelleCompetence;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int idCompetence;
    String libelleCompetence;


}
