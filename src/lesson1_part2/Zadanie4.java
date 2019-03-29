package lesson1_part2;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        //Napisz program, który wypisze na ekran konsoli czy podany kod Unicode jest liczbą (0-9),
        // małą literą (a-z) czy też dużą literą (A-Z). Kody każdej z grup znaków następują po sobie
        // więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić czy podany kod zawiera się w tym przedziale.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kod unicode");
        int x = scanner.nextInt();


        if ((48 <= x) && (x <= 57)) {
            System.out.println("liczba");
        } else if ((97 <= x) && (x <= 122)) {
            System.out.println("mała litera");
        } else if ((65 <= x) && (x <= 90)) {
            System.out.println("duża litera");
        } else {
            System.out.println("Całkiem inny znak");
        }
    }
}
