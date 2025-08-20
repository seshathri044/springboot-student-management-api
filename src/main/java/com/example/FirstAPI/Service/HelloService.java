package com.example.FirstAPI.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String greet() {
        return "Seshathri";
    }

    public String login() {
        return "Succesfully LogIn";
    }
}
