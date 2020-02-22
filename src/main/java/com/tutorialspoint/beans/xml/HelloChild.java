package com.tutorialspoint.beans.xml;

import lombok.Data;

@Data
public class HelloChild {
    public String text;

    public void sayHello() {
        System.out.println(text);
}
}
