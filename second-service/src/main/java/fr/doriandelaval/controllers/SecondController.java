package fr.doriandelaval.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message")
    public String test() {
        return "hello world from second service";
    }
}
