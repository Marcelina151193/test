package lesson1_part2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        //Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry.
        // Np. dla 1 - "niedostateczny", 2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ocenę od 1-6");
        int ocena = scanner.nextInt();


        switch (ocena) {
            case 1:
                System.out.println("niedostateczny");
                break;
            case 2:
                System.out.println("dopuszczalny");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("bardzo dobry");
                break;
            case 6:
                System.out.println("celujący");
                break;
            default:
                System.out.println("Cyfra poza skalą");
        }

    }
}
