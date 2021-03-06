
package io.github.gbalanyi.spring.framework;

import io.github.gbalanyi.spring.framework.config.BaseApplicationConfig;
import io.github.gbalanyi.spring.framework.service.MySecondSpringService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BaseApplicationConfig.class);

        MySecondSpringService mySecondSpringService = context.getBean(MySecondSpringService.class);
        mySecondSpringService.greeting("John Doe");
    }
}
