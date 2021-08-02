package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class MySecondSpringService {

    private final MyFirstSpringService myFirstSpringService;

    public MySecondSpringService(MyFirstSpringService myFirstSpringService) {
        this.myFirstSpringService = myFirstSpringService;
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", myFirstSpringService.getCurrentTimestamp(), name));
    }
}
