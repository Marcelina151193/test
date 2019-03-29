package lesson6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTask {
    //Napisz metodę, która będzie przyjmować imiona od użytkownika, a wprowadzenie znaku "q" przerwie jej
    // działanie i wyświetli wszystkie unikalne imiona dodane do kolekcji.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();
            names.add(input);

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
