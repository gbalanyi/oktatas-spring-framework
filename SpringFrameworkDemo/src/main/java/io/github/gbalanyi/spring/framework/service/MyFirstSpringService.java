package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class MyFirstSpringService {

    private String serviceName;

    public MyFirstSpringService(String serviceName){
        this.serviceName = serviceName;
    }

    public void greeting(String name) {
        System.out.println(String.format("Hello %s! I'm %s", name, serviceName));
    }
}
