package com.nrktsll.springbeanlifecycle.beandefinitions;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof MyCustomBean) {
            System.out.println("postProcessBeforeInitialization executed: " + beanName);
            ((MyCustomBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof MyCustomBean) {
            System.out.println("postProcessAfterInitialization executed: " + beanName);
             ((MyCustomBean) bean).afterInit();
        }

        return bean;
    }
}
