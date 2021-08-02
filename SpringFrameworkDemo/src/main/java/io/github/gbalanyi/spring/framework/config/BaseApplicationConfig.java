package io.github.gbalanyi.spring.framework.config;

import io.github.gbalanyi.spring.framework.service.MyFirstSpringService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "io.github.gbalanyi.spring.framework")
public class BaseApplicationConfig {

    @Bean
    public MyFirstSpringService myFirstSpringService() {
        return new MyFirstSpringService("Spring Service");
    }
}
