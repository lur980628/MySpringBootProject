package com.rookies4.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//Application 클래스가 Configuration(설정) 클래스 역할을 한다. @SpringBootConfiguration
//반드시 해당 클래스를 작성할때 base-package 아래에 작성을 해야한다.
public class MySpringBoot3ProjectApplication {

    public static void main(String[] args) {

        //SpringApplication.run(MySpringBoot3ProjectApplication.class, args);
        new SpringApplication(MySpringBoot3ProjectApplication.class);
    }


    @Bean
    public String hello() {
        return "Hello SpringBoot";
    }
}