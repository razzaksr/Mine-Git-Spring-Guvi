package com.example.mine_spring_crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hiThere(){
        return "Hi there!!!!!!!!!!!";
    }
}
