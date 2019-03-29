package lesson6.figuresList;

public interface Figure {
    double PI = 3.14159;

    double getArea();

    double getPerimeter();

    default void print() {
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
