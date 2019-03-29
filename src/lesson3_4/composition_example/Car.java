package lesson3_4.composition_example;

public class Car {
    private String brand;
    private Engine engine; // wkomponowana klasa `Engine`
    private Entertainment entertainment; // wkomponowana klasa Entertainment

  /* public Car(String brand, Engine engine) { // konstruktor wymaga od nas podania obiektu typu Engine
        this.brand = brand;
        this.engine = engine;
    } */

    public Car(String brand, Engine engine, Entertainment entertainment) {
        this.brand = brand;
        this.engine = engine;
        this.entertainment = entertainment;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        engine.start(); // wywołanie metody na obiekcie `Engine`
    }

    public EngineType getType() {
        return engine.getEngineType(); // wywołanie metody na obiekcie `Engine`
    }

    public Entertainment getEntertainment() {
        return entertainment;
    }

  /*  @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    } */

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", entertainment=" + entertainment +
                '}';
    }
}

