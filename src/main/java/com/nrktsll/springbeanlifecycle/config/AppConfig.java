package com.nrktsll.springbeanlifecycle.config;

import com.nrktsll.springbeanlifecycle.beandefinitions.MyCustomBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public MyCustomBean myCustomBean() {
        return new MyCustomBean();
    }
}
