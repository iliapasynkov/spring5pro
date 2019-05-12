/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5pro.annotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author hitman
 */
@ComponentScan(basePackages = {"ru.protechnologies.spring5pro"})
@Configuration
public class HelloSpringConfigurationScanning {
    
}
