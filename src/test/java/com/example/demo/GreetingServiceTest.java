package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetingServiceTest {
    @Autowired
    private GreetingService greetingService;
    @Test
    void getGreeting() {
        String expectedGreeting = "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieras estar manana";
        assertEquals(expectedGreeting, greetingService.getGreeting());
    }

    @Test
    void getGreetingWithName() {
        String expectedGreetingWithName = "Roberto. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieras estar manana";
        assertEquals(expectedGreetingWithName, greetingService.getGreetingWithName("Roberto"));
    }
    @Test
    void getGreetingInEnglish(){
        String expectedGreetingInEnglish="Ask yourself if ehat you are doing today is bringing you closer to where you want to be tomorrow";
        assertEquals(expectedGreetingInEnglish, greetingService.getGreetingInEnglish("en"));
    }
}
