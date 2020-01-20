package com.demo;

import com.demo.entities.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Team Liverpool = new Team();
        Liverpool.setName("Liverpool");
        Liverpool.setPosition("Champion");

        System.out.println(Liverpool.toString());

    }

}
