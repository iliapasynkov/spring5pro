/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import ru.protechnologies.spring5pro.MessageRenderer;

/**
 *
 * @author hitman
 */
public class DeclareSpringComponents {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //ctx.load("classpath:spring/app-context-xml.xml");
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer",
                MessageRenderer.class);
        messageRenderer.render();
        ctx.close();
    }
}
