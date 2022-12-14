package fr.test.swagger.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commun")
public class CommunController {
    @GetMapping
    public ResponseEntity<String> consultEndpoint() {
        return ResponseEntity.ok("commun");
    }
}
