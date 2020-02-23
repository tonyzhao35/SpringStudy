package com.tutorialspoint.beans.test;

import lombok.Data;

@Data
public class HelloSon {
    private String text;

    public void sayHello() {
        System.out.println(text);
}
}
