package com.tutorialspoint.beans.test;

import lombok.Data;

@Data
public class HelloWife {
    private String text;

    public void sayHello() {
        System.out.println(text);
}
}
