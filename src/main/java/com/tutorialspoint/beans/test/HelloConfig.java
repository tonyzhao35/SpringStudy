package com.tutorialspoint.beans.test;

public class HelloConfig {
    private String text;

    public void getText() {
        System.out.println("Your Message : " + text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void init() {
        System.out.println("init bean");
    }

    public void destroy() {
        System.out.println("destroy bean");
    }
}
