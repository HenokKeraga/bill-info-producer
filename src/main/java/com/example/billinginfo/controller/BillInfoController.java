package com.example.billinginfo.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillInfoController {
    private final Environment environment;

    public BillInfoController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/bill-info")
    public ResponseEntity<String> getBillingInfo() {
        return new ResponseEntity<>("billing info port number" + environment.getProperty("server.port"), HttpStatus.OK);
    }
}
