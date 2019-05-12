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
@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider configProvider) {
        this.messageProvider = configProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
