/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro;

import org.springframework.stereotype.Component;

/**
 *
 * @author hitman
 */
@Component("provider")
public class HelloSpringMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello, Spring5 from MessageProvider";
    }

}
