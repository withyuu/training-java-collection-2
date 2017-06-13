package net.digitaliccat.training.di.example;


public class Car {

    private Engine engine;

    public Car() {
        this.engine = new V7();
        // This class is tightly couple with V7 engine
        // We can think of tightly couple as a hard coded dependency
        // Tips: be careful when you use the keyword "new"
    }

    public void start() {
        this.engine.start();
    }
}
