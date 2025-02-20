package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.bean.Car;

@Configuration
public class AppConfig {

    @Bean(name="Audi")
    public Car audi() {
        Car audi = new Car();
        audi.setName("Audi");
        return audi;
    }

    @Bean(name="BMW")
    public Car bmw() {
        Car bmw = new Car();
        bmw.setName("BMW");
        return bmw;
    }
}
