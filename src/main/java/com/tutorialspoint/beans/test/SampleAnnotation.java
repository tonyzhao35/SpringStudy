package com.tutorialspoint.beans.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class SampleAnnotation {

    @Autowired(required = true)
    @Qualifier("helloSon2")
    private HelloSon helloSon;

    public void sayHello() {
//        helloSon.setText("Auto Annotation");
        helloSon.sayHello();
    }
}
