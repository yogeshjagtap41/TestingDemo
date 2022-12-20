package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {

    @GetMapping("/test")
    public String testing(){
        return "Hello World";
    }

}
