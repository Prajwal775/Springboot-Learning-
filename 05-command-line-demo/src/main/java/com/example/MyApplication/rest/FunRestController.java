package com.example.MyApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class FunRestController {
        @GetMapping("/")

        public String sayHello() {
            return "hello prajwal";
        }


        //expose a new endpoint for workout
    @GetMapping("/workout")
    public String doworkout()
    {
        return "run 2 km";
    }
    @GetMapping("/fortune")
    public String goodluck()
    {
        return "u won a lottery";
    }
    }

