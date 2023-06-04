package com.sai.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private String Sai;

    @GetMapping("/greeting")
    public String greeting(){
           Hello a = new Hello();
           return a.helo();

    }
    @GetMapping("/hello")
    public String wish(@RequestParam(value="name", defaultValue = "sai") String name){
    return String.format("Hello %s", name);
    }

}
