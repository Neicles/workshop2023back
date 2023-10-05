package com.example.workplace2023Backend.contoller;
import com.example.workplace2023Backend.Class.demandeRepository;
import com.example.workplace2023Backend.Class.categorieRepository;
import com.example.workplace2023Backend.Class.competenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.workplace2023Backend.Class.Utilisateur;
import com.example.workplace2023Backend.Class.utilisateurRepository;
@Service
public class AuthService {

    @Autowired
    private competenceRepository competenceRepository;
    @Autowired
    private categorieRepository categorieRepository;
    @Autowired
    private utilisateurRepository utilisateurRepository;
    @Autowired
    private demandeRepository demandeRepository;

    public Utilisateur verifierEmailEtMotDePasse(String mail, String motDePasse) {
        Utilisateur utilisateur = utilisateurRepository.findByMail(mail);

        if (utilisateur != null && utilisateur.getMdp().equals(motDePasse)) {
            // Comparaison du mot de passe entré avec le mot de passe de l'utilisateur
            return utilisateur;
        } else {
            return null; // L'utilisateur n'a pas été trouvé par l'adresse e-mail
        }
    }

}