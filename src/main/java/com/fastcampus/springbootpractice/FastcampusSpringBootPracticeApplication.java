package com.fastcampus.springbootpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    private final Integer height;
    private final Environment environment;
    private final ApplicationContext applicationContext;

    public FastcampusSpringBootPracticeApplication(
            @Value("${my.height}") Integer height,
            Environment environment,
            ApplicationContext applicationContext
            ) {
        this.height = height;
        this.environment = environment;
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);

    }
    
    @PostConstruct
    public void init(){
        System.out.println("[@Value] " + height);
        System.out.println("[Environment] " + environment.getProperty("my.height"));
        System.out.println("[ApplicationContext] " + applicationContext.getEnvironment().getProperty("my.height"));
    }
}
