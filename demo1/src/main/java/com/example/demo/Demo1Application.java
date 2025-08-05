package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        Employee employee = Employee.builder()
                .id(1)
                .firstName("A")
                .lastName("B")
                .email("a@b.c")
                .build();

    }
    @GetMapping("/hello") // se usará el método hello() para responder consultas enviadas al http://localhost:8080/hello
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        // @RequestParam para esperar un valor en la consulta, si no hay, usará defaultValue.
        return "Hello "+name;
    }
}
