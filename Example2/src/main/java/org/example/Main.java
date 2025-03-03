package org.example;

import org.example.bean.Car;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Getting bean detail using custom bean names
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car audi = context.getBean("Audi", Car.class);
        System.out.println(audi.getName());
        Car bmw = context.getBean("BMW", Car.class);
        System.out.println(bmw.getName());
    }
}