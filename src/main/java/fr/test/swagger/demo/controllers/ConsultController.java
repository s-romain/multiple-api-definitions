package fr.test.swagger.demo.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("consult")
@RestController
@RequestMapping("/consult")
public class ConsultController {
    @GetMapping
    public ResponseEntity<String> consultEndpoint() {
        return ResponseEntity.ok("consult");
    }
}
