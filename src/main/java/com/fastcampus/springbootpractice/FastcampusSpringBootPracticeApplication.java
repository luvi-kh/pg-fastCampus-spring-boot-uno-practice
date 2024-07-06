package com.fastcampus.springbootpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    @Value("${my.height}")
    private Integer height;

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);

    }
    
    @PostConstruct
    public void init(){
        System.out.println("[@Value] " + height);
    }
}
