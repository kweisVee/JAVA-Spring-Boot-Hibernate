package com.kweis.springboot.demo.mycoolapp.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//    return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

//    expose new endpoint
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
