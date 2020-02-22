package com.tutorialspoint.autowired.service.impl;

import com.tutorialspoint.autowired.bean.SampleBean;
import com.tutorialspoint.autowired.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleBean sampleBean;

    public SampleBean testSample(String text){
        sampleBean.setBeantext(text);
        return sampleBean;
    }


}
