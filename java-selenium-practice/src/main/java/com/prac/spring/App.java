package com.prac.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Project: java-selenium-practice-parent
 * Package: java.prac
 * <p>
 * User: vamshi
 * Date: 4/24/18
 * Time: 8:01 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.prac.spring"})
public class App {
    static public void main(String... args) {
        BeanFactory beanFactory = SpringApplication.run(App.class, args);
        beanFactory.getBean(WelcomeMessageBanner.class).printWelcomeBanner();

    }
}
