package com.ingnum.rentalservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BonjourController {

    @Value("${customer.service.url}")
    private String customerServiceUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/bonjour")
    public String bonjour() {
        return "bonjour";
    }

    @GetMapping("/customer/{name}")
    public String customer(@PathVariable String name) {
        try {
            String prenom = restTemplate.getForObject(customerServiceUrl, String.class);
            return "Bonjour " + name + " (service PHP -> " + prenom + ")";
        } catch (Exception e) {
            return "Bonjour " + name + " (erreur appel PHP: " + e.getMessage() + ")";
        }
    }
}
