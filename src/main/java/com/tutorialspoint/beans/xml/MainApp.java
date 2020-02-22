package com.tutorialspoint.beans.xml;

import com.tutorialspoint.autowired.bean.SampleBean;
import com.tutorialspoint.autowired.common.SpringContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        ApplicationContext autowiredContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SampleBean bean = SpringContext.getInstance().getSampleService().testSample("My first autowired App");
        System.out.println(bean.getBeantext());
    }
}