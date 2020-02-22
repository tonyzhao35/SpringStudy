package com.tutorialspoint.beans.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorld {
    private String message;
    private String others;
    private HelloChild child;

    public HelloWorld(HelloChild child, String text) {
        this.child = child;
        child.setText(text);
    }

    public void sayHello() {
        child.sayHello();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void getOthers() {
        System.out.println("Your Others : " + others);
    }

    public void init() throws Exception {
//        System.out.println("init bean");
    }

    public void destroy() throws Exception {
//        System.out.println("destroy bean");
    }

}