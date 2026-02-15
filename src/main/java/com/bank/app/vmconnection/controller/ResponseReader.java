package com.bank.app.vmconnection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseReader {

    @GetMapping("/helloVM")
    public String helloVM(){
        return "Hello!!! I am your VM";
    }

}
