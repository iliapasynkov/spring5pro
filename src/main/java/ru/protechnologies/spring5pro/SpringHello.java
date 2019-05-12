/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro;

/**
 *
 * @author hitman
 */
public class SpringHello {

    public static void main(String... args) {
        /*
         if (args.length > 0) {
         System.out.println("Hello, " + args[0]);
         } else {
         System.out.println("Hello, Spring5");
         }
         */
        /*
         MessageRenderer mr = new StandardOutMessageRenderer();
         MessageProvider mp = new HelloSpringMessageProvider();
         mr.setMessageProvider(mp);
         mr.render();
         */
        MessageRenderer mr
                = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp
                = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
