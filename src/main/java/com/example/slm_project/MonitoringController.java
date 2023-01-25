package com.example.slm_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    public String state = "Everything works as expected";


    @GetMapping("/api/message")
    public String Message(){

        return state;

    }
    @GetMapping("/api/message/reset")
    public String Message1(){

        this.state = "Everything works as expected";
        return "ok";

    }

    @GetMapping("/api/message/set")
    public String Message2(String state){

        this.state = state;
        return "ok";

    }

}
