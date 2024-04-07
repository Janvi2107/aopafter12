package com.aopafter;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class MainApp { 
    public static void main(String[] args) { 
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContect.xml"); 
         
        Multiplier multiplier = (Multiplier) context.getBean("Multiplier");         
        int result = multiplier.multiply(5, 3); 
        System.out.println("Product is " + result); 
    } 
} 
