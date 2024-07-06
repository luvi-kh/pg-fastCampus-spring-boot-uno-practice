package com.fastcampus.springbootpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    @Value("${my.height}")
    private Integer height;

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);

        FastcampusSpringBootPracticeApplication app = new FastcampusSpringBootPracticeApplication();
        app.abc();
    }
    
    //생성자주입이 아니라, 필드주입방식이기에, 인스턴스가 생성된 뒤에 주입되서 null이 나옴
    public void abc() {
        System.out.println("[@Value] " + height);
    }

}
