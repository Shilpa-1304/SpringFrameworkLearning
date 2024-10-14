package com.AnnotaionConfigProject.ApplicationContextProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Configuration
@ComponentScan(basePackages = {"com.AnnotaionConfigProject"})
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("Configuration file bean created.");
    }

    @Bean
    public LocalTime getTime(){
        System.out.println(LocalTime.now());
        return LocalTime.now();
    }
}
