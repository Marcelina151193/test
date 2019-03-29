package lesson2;

public class Car {
    private String brand;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;




    }
}
