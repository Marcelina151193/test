package lesson7.Generics;

public class BoxTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox = new Box<>(apple);
        appleBox.isRotten();
        Box<Orange> orangeBox = new Box<>(orange);
        orangeBox.isRotten();


    }
}
