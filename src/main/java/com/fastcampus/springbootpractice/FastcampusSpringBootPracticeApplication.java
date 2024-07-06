package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

//    private final Integer height;
//    private final Environment environment;
//    private final ApplicationContext applicationContext;
    private final MyProperties myProperties;

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);

    }
    
    @PostConstruct
    public void init(){
//        System.out.println("[@Value] " + height);
//        System.out.println("[Environment] " + environment.getProperty("my.height"));
//        System.out.println("[ApplicationContext] " + applicationContext.getEnvironment().getProperty("my.height"));
        System.out.println("[configurationProps] " + myProperties.getHeight());
    }

}
