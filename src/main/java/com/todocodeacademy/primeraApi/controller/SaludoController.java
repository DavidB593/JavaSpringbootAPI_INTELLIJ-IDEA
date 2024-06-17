package com.todocodeacademy.primeraApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "HOLA MUNDOO";
    }

}
