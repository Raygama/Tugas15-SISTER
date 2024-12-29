package com.sister.sister15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sister15Application {

    @GetMapping("/messages")
    public String Message() {
        return "Tugas 15 Cloud Computing - Azure Web Application";
    }

    @GetMapping("/new")
    public String New() {
        return "Tugas 15 Cloud Computing - New Method";
    }

    public static void main(String[] args) {
        SpringApplication.run(Sister15Application.class, args);
    }

}
