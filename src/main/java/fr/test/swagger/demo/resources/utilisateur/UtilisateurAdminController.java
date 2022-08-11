package fr.test.swagger.demo.resources.utilisateur;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("admin")
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurAdminController {
    @PostMapping
    public ResponseEntity<String> adminEndpoint() {
        return ResponseEntity.ok("creer utilisateur");
    }
}
