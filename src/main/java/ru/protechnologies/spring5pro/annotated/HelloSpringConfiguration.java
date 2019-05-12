/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.protechnologies.spring5pro.HelloSpringMessageProvider;
import ru.protechnologies.spring5pro.MessageProvider;
import ru.protechnologies.spring5pro.MessageRenderer;
import ru.protechnologies.spring5pro.StandardOutMessageRenderer;

/**
 *
 * @author hitman
 */
@Configuration
public class HelloSpringConfiguration {

    // equivalent to <bean id="provider" class=".."/>
    @Bean
    public MessageProvider provider() {
        return new HelloSpringMessageProvider();
    }

    // equivalent to <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
