package com.tutorialspoint.beans.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("singleton")
    public HelloConfig helloConfig() {
        return new HelloConfig();
    }
}
