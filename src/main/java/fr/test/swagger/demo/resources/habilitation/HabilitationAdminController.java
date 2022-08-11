package fr.test.swagger.demo.resources.habilitation;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("admin")
@RestController
@RequestMapping("/habilitations")
public class HabilitationAdminController {
    @PostMapping
    public ResponseEntity<String> adminEndpoint() {
        return ResponseEntity.ok("creer habilitation");
    }
}
