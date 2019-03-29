package lesson1_part2;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        //Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
        // (dla 1 - "poniedziałek", 2 - "wtorek" itp). Dodatkowo wyświetl ile dni zostało do weekendu,
        // dla poniedziałku - 5 dni, wtorku - 4 itp.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzień tygodnia 1-7");
        int x = scanner.nextInt();

        int y = 5 - x;

        switch (x) {
            case 1:
                System.out.println("poniedziałek, do weekendu zostało" + y + " dni"); break;
            case 2:
                System.out.println("wtorek, do weekendu zostało" + y + " dni"); break;
            case 3:
                System.out.println("środa, do weekendu zostało" + y + " dni"); break;
            case 4:
                System.out.println("czwartek, do weekendu zostało" + y + " dni"); break;
            case 5:
                System.out.println("piątek, do weekendu zostało" + y + " dni"); break;
            case 6:
                System.out.println("sobota, weekend"); break;
            case 7:
                System.out.println("niedziela, weekend"); break;
            default:
                System.out.println("Tydzień ma 7 dni!!!");
        }

    }
}
