package com.example.Greeting_App.Service;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public static String getGreetingMessage() {
        return "Hello World";
    }
}