package com.example.workplace2023Backend.contoller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.workplace2023Backend.Class.Utilisateur;
import com.example.workplace2023Backend.Class.utilisateurRepository;
@Service
public class AuthService {

    @Autowired
    private utilisateurRepository utilisateurRepository;

    public boolean verifierEmailEtMotDePasse(String mail, String motDePasse) {
        Utilisateur utilisateur = utilisateurRepository.findByMail(mail);

        if (utilisateur != null) {
            // Comparaison du mot de passe entré avec le mot de passe de l'utilisateur
            return motDePasse.equals(utilisateur.getMdp());
        } else {
            return false; // L'utilisateur n'a pas été trouvé par l'adresse e-mail
        }
    }
}