package com.example.slm_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    @GetMapping("/api/message")

    public String getMessage(){

        return "Everything works as expected";

    }

}
