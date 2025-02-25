package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    // Constructor Injection
    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("🚗 Car instance created!");
    }

    public void drive() {
        engine.start();
        System.out.println("🚘 Car is driving...");
    }
}

