package beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("🔧 Engine instance created!");
    }

    public void start() {
        System.out.println("🚗 Engine is starting...");
    }
}