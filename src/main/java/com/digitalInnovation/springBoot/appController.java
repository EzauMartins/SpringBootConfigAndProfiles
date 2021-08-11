package com.digitalInnovation.springBoot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }
}
