package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class MyFirstSpringService {

    public void greeting(String name) {
        System.out.println(String.format("Hello %s!", name));
    }
}
