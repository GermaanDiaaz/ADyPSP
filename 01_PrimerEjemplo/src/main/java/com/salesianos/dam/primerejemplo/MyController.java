package com.salesianos.dam.primerejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @GetMapping ("/hello")
    public Greeting hello(String name){
        @RequestParam(defaultValue = "World"){

        }
        return new Greeting("Hello", name);

    }

    @GetMapping("/api/")
    public List<Greeting> hellos(){
        return List.of(new Greeting("Hello"));
    }
    record Greeting (String greeting, String name){
    }
}
