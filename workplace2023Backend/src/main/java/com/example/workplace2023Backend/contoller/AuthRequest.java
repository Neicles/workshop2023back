package com.example.workplace2023Backend.contoller;

public class AuthRequest {
    private String email;
    private String password;

    public AuthRequest(String mail, String mdp) {
        this.email = mail;
        this.password = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = email;
    }

    public String getMotDePasse() {
        return password;
    }

    public void setMotDePasse(String motDePasse) {
        this.password = password;
    }
}
