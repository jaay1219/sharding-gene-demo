package com.jaay.gene.demo.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jaay.gene.demo.mapper")
@ComponentScan(basePackages = "com.jaay.gene.demo")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }

}
