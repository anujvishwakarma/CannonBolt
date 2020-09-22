package com.example.cadmus.cannonbolt.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @RequestMapping("/healthCheck")
    public String isServerAlive(){
        return "Alive";
    }
}
