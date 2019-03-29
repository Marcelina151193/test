package lesson1_part2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        //Napisz program, który wypisze na ekran konsoli, czy dana liczba całkowita
        // znajduje się w przedziale 1-10, 11-100, 101-1000, 1001-10000, czy też może jest
        // mniejsza od 0 lub większa od 10000. Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("Liczba mniejsza od 0");

        } else if (x <= 10) {
            System.out.println("1-10");
        } else if (x <= 100) {
            System.out.println("11-100");
        } else if (x <= 1000) {
            System.out.println("101-1000");
        } else if (x <= 10000) {
            System.out.println("1001-10000");
        } else {
            System.out.println("Większe od 10000");
        }
    }
}
