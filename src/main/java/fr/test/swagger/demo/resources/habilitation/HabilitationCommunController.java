package fr.test.swagger.demo.resources.habilitation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilitations")
public class HabilitationCommunController {
    @GetMapping("/{id}")
    public ResponseEntity<String> communEndpoint(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok("habilitation id " + id);
    }
}
