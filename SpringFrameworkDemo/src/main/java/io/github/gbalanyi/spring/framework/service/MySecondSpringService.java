package io.github.gbalanyi.spring.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondSpringService {

    private MyFirstSpringService myFirstSpringService;

    @Autowired
    public void setMyFirstSpringService(MyFirstSpringService myFirstSpringService) {
        this.myFirstSpringService = myFirstSpringService;
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", myFirstSpringService.getCurrentTimestamp(), name));
    }
}
