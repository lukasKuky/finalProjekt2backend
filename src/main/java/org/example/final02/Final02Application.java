package org.example.final02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Final02Application {

    public static void main(String[] args) {
        SpringApplication.run(Final02Application.class, args);
        System.out.println("aplikacia beží na porte : http://http://localhost:8080/");
        System.out.println("čau maji");
    }

}
