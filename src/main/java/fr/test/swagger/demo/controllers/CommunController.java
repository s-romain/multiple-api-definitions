package fr.test.swagger.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunController {
    @GetMapping("/commun")
    public ResponseEntity<String> consultEndpoint() {
        return ResponseEntity.ok("commun");
    }
}
