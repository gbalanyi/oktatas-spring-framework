package io.github.gbalanyi.spring.framework.config;

import java.time.Clock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "io.github.gbalanyi.spring.framework")
public class BaseApplicationConfig {

    @Bean
    public Clock clock() {
        return Clock.systemUTC();
    }
}
