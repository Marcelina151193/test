package lesson2;

// Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod,
// np.: convertToCelsius(double temperatureInFahrenheit), getComputerPrice()

// W klasie FahrenheitConverter dodaj metodę, która konwertuje temperatury w drugą stronę (Celsjusz → Fahrenheit)

public class FahrenheitConverter {

    public double fahrenheitToCelsius(double f) {


        double c = (f - 32) / 1.8;

        return c;
    }
    public double celsiusToFahrenheit(double c) {


        double f = (c * 1.8) + 32;

        return f;
    }

}
