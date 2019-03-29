package lesson6.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        try { //kod, w którym mogą powstać wyjątki
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);

        } catch (ArrayIndexOutOfBoundsException aioobe) { //przekroczenie zakresu indeksu tablicy
            System.out.println("Wystąpił błąd: 'Próba dostępu do indeksu, który nie istnieje" + aioobe);
        } catch (InputMismatchException ime) {//obsługa wyjątku pierwszego rodzaju: nie wprowadzono inta
            System.out.println("Nie wprowadzono poprawnej liczby int + ime");
        }
        finally {
            System.out.println("Kontynuujmy");
        }
    } //main
} // class
