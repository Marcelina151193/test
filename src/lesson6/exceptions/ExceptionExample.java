package lesson6.exceptions;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            try {
               int num = getNumber(input);
                double sqrt = getSqrt(num);
                System.out.println("Sqrt for " + num + " = " + sqrt);
            } catch (MyException | NumberFormatException e) {
                System.out.println("MyException or NumberFormatException");
            } finally {
                System.out.println("We will continue in loop ;)");
            }
        }
    }

    private static int getNumber(String input) {
       return Integer.parseInt(input);
    }

    private static double getSqrt(int num) throws MyException {
        if (0 > num) {
            throw new MyException();
        }
        return java.lang.Math.sqrt(num);
    }
}
