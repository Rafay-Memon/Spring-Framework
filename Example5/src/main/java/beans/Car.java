package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired  // Autowire by field
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("🚘 Car is driving...");
    }
}

