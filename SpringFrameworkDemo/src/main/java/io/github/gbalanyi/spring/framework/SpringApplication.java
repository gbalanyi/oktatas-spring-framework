
package io.github.gbalanyi.spring.framework;

import io.github.gbalanyi.spring.framework.config.BaseApplicationConfig;
import io.github.gbalanyi.spring.framework.service.MyFirstSpringService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BaseApplicationConfig.class);

        MyFirstSpringService myFirstSpringService = context.getBean(MyFirstSpringService.class);
        myFirstSpringService.greeting("John Doe");
    }
}
