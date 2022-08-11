package fr.test.swagger.demo.resources.utilisateur;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurCommunController {
    @GetMapping("/{id}")
    public ResponseEntity<String> communEndpoint(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok("utilisateur id " + id);
    }
}
