package com.tutorialspoint.beans.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class SampleAnnotation {
    @Autowired
    private HelloSon helloSon;

    public void sayHello() {
        helloSon.setText("Auto Annotation");
        helloSon.sayHello();
    }
}
