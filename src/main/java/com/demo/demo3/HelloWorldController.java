package com.demo.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "You have successfully created Java Webservice DEMO3 using wizard. Awesome right!!!";
    }

}

