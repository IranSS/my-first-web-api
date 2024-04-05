package web.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping
    public String welcome(){
        return "Welcome to my Spring boot web API";
    }
}
