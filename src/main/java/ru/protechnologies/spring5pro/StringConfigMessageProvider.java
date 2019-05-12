/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hitman
 */
@Service("configProvider")
public class StringConfigMessageProvider implements MessageProvider{

    private String message;

    @Autowired
    public StringConfigMessageProvider(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
}
