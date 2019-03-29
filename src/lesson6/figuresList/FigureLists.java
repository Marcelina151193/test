package lesson6.figuresList;

import java.util.ArrayList;
import java.util.List;

public class FigureLists {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(8);

        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(7, 8);
        Rectangle rectangle3 = new Rectangle(2, 4);


        List<Circle> circles = new ArrayList<>();   // lepsze rozwiązanie circles.add(new Circle (5)) bez tworzenia obiektów najpierw
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);

        List<Figure> figures = new ArrayList<>();   //<-- Polimorfizm; tworzymy tablicę różnych obiektów, które dziedziczą z klasy Figure
        figures.add(rectangle1);
        figures.add(rectangle2);
        figures.add(rectangle3);
        figures.add(circle1);
        figures.add(circle2);
        figures.add(circle3);  // w pętli w środku używamy figures

       // Iterator<Circle> circleItarator = circles.iterator();  <-inny sposób z iteratorem
        // double circlesArea = 0.0;
        // double circlesParameteres = 0.0;
        //while (circleIterator.hasNext()){
        //Circle circle = circleIterator.next();
        //circles......


        for (int i = 0; i < circles.size(); i++) {

            System.out.println("Pole wynosi: " + circles.get(i).getArea());     // miało jeszcze sumować te pola :)
            System.out.println("Obwód wynosi: " + circles.get(i).getPerimeter());
        }
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println("Pole wynosi: " + rectangles.get(i).getArea());
            System.out.println("Obwód wynosi: " + rectangles.get(i).getPerimeter());
        }
    }
}
