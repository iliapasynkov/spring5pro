/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.protechnologies.spring5pro.annotated.HelloSpringConfiguration;

/**
 *
 * @author hitman
 */
public class HelloSpringDI {

    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
