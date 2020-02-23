package com.tutorialspoint.beans.test;

import lombok.Data;

@Data
public class AutoWire {
    private String message;
    private String text;
    private HelloSon helloSon;
    private HelloWife helloWife;

    public void sayHello() {
        helloSon.setText(this.message);
        helloSon.sayHello();
        helloWife.sayHello();
    }

    public AutoWire(HelloWife helloWife, String text) {
        this.helloWife = helloWife;
        this.helloWife.setText(text);
    }
}
