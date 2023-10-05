package com.example.workplace2023Backend.contoller;
import com.example.workplace2023Backend.Class.Demande;
import com.example.workplace2023Backend.Class.utilisateurRepository;
import com.example.workplace2023Backend.Class.demandeRepository;
import com.example.workplace2023Backend.Class.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private utilisateurRepository utilisateurRepository;
    @Autowired
    private demandeRepository demandeRepository;

    @Autowired
    private AuthService authService;
    @PostMapping("/connexion")
    public ResponseEntity<Utilisateur> connexion() {
        String email = "admin@gmail.com";
        String motDePasse = "onx7ud";
        Utilisateur utilisateur = authService.verifierEmailEtMotDePasse(email, motDePasse);
        if (utilisateur != null) {
            // L'authentification est réussie, redirigez vers une page de succès.
            return ResponseEntity.ok(utilisateur);
        } else {
            // L'authentification a échoué, redirigez vers une page d'erreur.
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

    }
    @GetMapping("/allUser")
    public ResponseEntity<List<Utilisateur>> recupererTousLesUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurRepository.findAll();

        if (utilisateurs.isEmpty()) {
            return ResponseEntity.notFound().build(); // Réponse HTTP 404 en cas d'erreur
        }

        return ResponseEntity.ok(utilisateurs); // Réponse HTTP 200 avec les utilisateurs en JSON
    }
    @GetMapping("/allMission")
    public ResponseEntity<List<Demande>> recupererTousLesDemandes() {
        List<Demande> demandes = demandeRepository.findAll();

        if (demandes.isEmpty()) {
            return ResponseEntity.notFound().build(); // Réponse HTTP 404 en cas d'erreur
        }

        return ResponseEntity.ok(demandes); // Réponse HTTP 200 avec les utilisateurs en JSON
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Utilisateur> getAllUsers() {
        // This returns a JSON or XML with the users
        return utilisateurRepository.findAll();
    }
}