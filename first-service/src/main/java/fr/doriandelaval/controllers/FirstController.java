package fr.doriandelaval.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping("/message")
    public String test() {
        return ("hello world from first-service");
    }
}
