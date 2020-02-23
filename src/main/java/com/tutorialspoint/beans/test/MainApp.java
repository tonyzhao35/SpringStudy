package com.tutorialspoint.beans.test;

import com.tutorialspoint.autowired.bean.SampleBean;
import com.tutorialspoint.autowired.common.SpringContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

//        // Use ApplicationContext ClassPathXmlApplicationContext to load bean
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Beans.test");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();
//
//        // Use XmlBeanFactory ClassPathResource to load bean
//        XmlBeanFactory factory = new XmlBeanFactory
//                (new ClassPathResource("Beans.test"));
//        HelloWorld obj1 = (HelloWorld) factory.getBean("helloWorld");
//        obj1.getMessage();

        // Use ApplicationContext FileSystemXmlApplicationContext to load bean
//        ApplicationContext file =
//                new FileSystemXmlApplicationContext("C:/Project/20200220/SpringStudy/web/WEB-INF/Beans.test");
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

        JavaCollection collection = (JavaCollection) context.getBean("javaCollection");
        collection.getAddressList();
        collection.getAddressSet();
        collection.getAddressMap();
        collection.getAddressProp();

        AutoWire autoWire = (AutoWire) context.getBean("autoWire");
        autoWire.sayHello();

        ApplicationContext autowiredContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SampleBean bean = SpringContext.getInstance().getSampleService().testSample("My first autowired App");
        System.out.println(bean.getBeantext());

        SampleAnnotation sa  = (SampleAnnotation) context.getBean("sampleAnnotation");
        sa.sayHello();

        context.registerShutdownHook();
    }
}