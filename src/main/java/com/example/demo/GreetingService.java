package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Value("${greet1}")
    private String greet;
    @Value("${greet}")
    private String greetWithName;
    @Value("${greet2}")
    private String greetInEnglish;
    public String getGreeting(){
        return greet;
    }

    public String getGreetingWithName(String name) {
        return String.format(greetWithName, name);
    }
    public String getGreetingInEnglish(String lang){
        String greeting=" ";
        if(lang.equals("en"))
        {
            greeting=greetInEnglish;
        }
        return greeting;
    }
}
