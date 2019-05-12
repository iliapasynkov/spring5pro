/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.protechnologies.spring5pro.MessageRenderer;
import ru.protechnologies.spring5pro.annotated.HelloSpringConfigurationScanning;

/**
 *
 * @author hitman
 */
public class DeclareSpringConfig {

    public static void main(String... args) {
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloSpringConfigurationScanning.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
