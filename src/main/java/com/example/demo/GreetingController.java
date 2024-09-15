package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @GetMapping
    public String greeting(){
        return greetingService.getGreeting();
    }
    @GetMapping("/withName")
    public String greetingWithName(@RequestParam String name){
        return greetingService.getGreetingWithName(name);
    }
    @GetMapping("/language")
    public String greetingInEnglish(String lang){
        return greetingService.getGreetingInEnglish(lang);
    }
}
