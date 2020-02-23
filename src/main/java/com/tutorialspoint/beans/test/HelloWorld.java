package com.tutorialspoint.beans.test;

public class HelloWorld {
    private String message;
    private String others;
    private HelloChild child;
    private HelloSon son;
    private HelloWife wife;

    public HelloWorld(HelloChild child, String text) {
        this.child = child;
        child.setText(text);
    }

    public void sayHello() {
        child.sayHello();
        son.sayHello();
        wife.sayHello();
    }

    public void setSon(HelloSon son) {
        this.son = son;
        son.setText("Son says hello!");
    }

    public void setWife(HelloWife wife) {
        this.wife = wife;
        wife.setText("Wife says hello!");
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