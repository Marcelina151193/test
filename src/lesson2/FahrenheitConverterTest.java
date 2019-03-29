package lesson2;

public class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverter fahren = new FahrenheitConverter ();
       double result = fahren.fahrenheitToCelsius(23);
        System.out.println(result);
    }
}
