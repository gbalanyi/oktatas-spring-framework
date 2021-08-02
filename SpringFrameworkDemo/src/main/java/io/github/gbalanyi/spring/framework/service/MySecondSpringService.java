package io.github.gbalanyi.spring.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondSpringService {

    @Autowired
    private MyFirstSpringService myFirstSpringService;

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", myFirstSpringService.getCurrentTimestamp(), name));
    }
}
