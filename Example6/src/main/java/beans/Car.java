package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car() {
        System.out.println("🚗 Car instance created!");
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("🔧 Engine injected via Setter!");
    }

    public void drive() {
        engine.start();
        System.out.println("🚘 Car is driving...");
    }
}

