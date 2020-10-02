package com.nrktsll.springbeanlifecycle.beandefinitions;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyBeans implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware, BeanFactoryAware {

    private Integer value;
    private HelloBean helloBean;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("* afterPropertiesSet executed *");
        value = 2;
        System.out.println("afterPropertiesSet's Value: " + value + "\n");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("* destroy executed *");
        value = null;
        System.out.println("destroy's Value: " + value + "\n");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("* @PostConstruct executed *");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("* @PreDestroy executed *");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName executed:" + name + "\n");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("* setApplicationContext executed *" + "\n");
        var customBean = applicationContext.getBean(MyCustomBean.class);
        customBean.Hello();
        helloBean.Hello();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.helloBean = beanFactory.getBean(HelloBean.class);
    }
}
