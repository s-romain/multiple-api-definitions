package fr.test.swagger.demo.resources.habilitation;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("consult")
@RestController
@RequestMapping("/habilitations")
public class HabilitationConsultController {
    @GetMapping
    public ResponseEntity<String> consultEndpoint() {
        return ResponseEntity.ok("list habilitation");
    }
}
