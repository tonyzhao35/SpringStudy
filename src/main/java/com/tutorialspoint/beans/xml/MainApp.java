package com.tutorialspoint.beans.xml;

import com.tutorialspoint.autowired.bean.SampleBean;
import com.tutorialspoint.autowired.common.SpringContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {

//        // Use ApplicationContext ClassPathXmlApplicationContext to load bean
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();
//
//        // Use XmlBeanFactory ClassPathResource to load bean
//        XmlBeanFactory factory = new XmlBeanFactory
//                (new ClassPathResource("Beans.xml"));
//        HelloWorld obj1 = (HelloWorld) factory.getBean("helloWorld");
//        obj1.getMessage();

//        ApplicationContext autowiredContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        SampleBean bean = SpringContext.getInstance().getSampleService().testSample("My first autowired App");
//        System.out.println(bean.getBeantext());

        // Use ApplicationContext FileSystemXmlApplicationContext to load bean
//        ApplicationContext file =
//                new FileSystemXmlApplicationContext("C:/Project/20200220/SpringStudy/web/WEB-INF/Beans.xml");
//        HelloWorld obj2 = (HelloWorld) file.getBean("helloWorld");
//        obj2.getMessage();
//
//        obj2.setMessage("changed!");
//
//        // Use ApplicationContext FileSystemXmlApplicationContext to load bean
//        HelloWorld obj3 = (HelloWorld) file.getBean("helloWorld");
//        obj3.getMessage();

        // Use ApplicationContext ClassPathXmlApplicationContext to load bean
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        obj.getOthers();
        obj.sayHello();
        context.registerShutdownHook();
    }
}