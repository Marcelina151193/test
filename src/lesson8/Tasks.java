package lesson8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        //#1
        //useLambdas();

        //#2
        useStreams();

        //#3
        //useOptional();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
        // utworzy obiekt klasy Double (Supplier)
        Supplier<Double> doubleSupplier1 = () -> {
            return 10.7;
        };
        System.out.println("doubleSupplier1.get() = " + doubleSupplier1.get());

        //pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
        Consumer<String> stringConsumer1 = (n) -> System.out.println("stringConsumer1:" + n);
        stringConsumer1.accept("Marcelina");


        //sprawdzi czy podany string ma długość > 10 (Predicate)

        Predicate<String> predicateStr = (string) -> {
            if (string != null) {
                return string.length() > 10;
            }
            return false;
        };
    }


    // przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
    BiFunction<Integer, Integer, String> biFunction = (x, y) ->
            String.valueOf(x + y);
    // System.out.println(biFunction.apply(4,5));


    /**
     * 2. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {
        Set<Double> newDoubles = new HashSet<>();
        newDoubles.add(1.3);
        newDoubles.add(.3);
        newDoubles.add(4.3);

        Stream<Double> stream = newDoubles.stream();
        Double sum = stream.reduce(0.0, (d1, d2) -> d1 + d2);
        OptionalDouble avg = stream.mapToDouble(value -> value).average();   //bo w Double mamy funkcję average, zawartość mapToDouble ctrl+spacja podpowiada intelliJ
        System.out.println(sum);
        System.out.println(avg.getAsDouble());

        int sum1 = IntStream.range(10, 40).filter(value -> value % 2 != 0).sum();

    }


    /**
     * 3. Utwórz obiekt Optional, który:
     * - nie będzie zawierał żadnej wartości (Optional.empty)
     * - będzie pozwalał przyjmować wartość typu String, która może być `null` (Optional.ofNullable)
     * - rzuci wyjątkiem, w momencie podania wartości null typu Float (Optional.of)
     * - rzuci własny wyjątek, jeśli podano wartość `null` i próbowano pobrać wartość (Optional.orElseThrow)
     * - zwróci wartość domyślną dla typu String jeśli podano wartość `null` (Optional.orElse)
     */
    private static void useOptional() {
        Optional<Integer> emptyOptional = Optional.empty();     //
        System.out.println(emptyOptional.isPresent());
        emptyOptional.ifPresent(s -> System.out.println("ok"));
        emptyOptional.get();

        Optional<String> emptOptional = Optional.of("123");   //
        System.out.println(emptOptional.isPresent());
        emptOptional.ifPresent(s -> System.out.println("ok"));
        emptOptional.orElseThrow(() -> new RuntimeException());

        Optional<String> empOptional = Optional.ofNullable("null");   //
        System.out.println(empOptional.isPresent());
        emptOptional.ifPresent(s -> System.out.println("ok"));
        System.out.println(empOptional.orElse(" "));

    }


}
