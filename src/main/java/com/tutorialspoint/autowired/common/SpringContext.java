package com.tutorialspoint.autowired.common;

import com.tutorialspoint.autowired.service.SampleService;
import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Autowired
    @Getter
    private SampleService sampleService;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static SpringContext getInstance() {
        return applicationContext.getBean(SpringContext.class);
    }
}
