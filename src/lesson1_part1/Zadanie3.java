package lesson1_part1;

public class Zadanie3 {
    public static void main(String[] args) {
        // napisz program, który tworzy jedną zmieną i wyrzuca true, jeśli jest parzysta i false jeśli nie
        int x = 10;
        boolean y;
        if (x % 2 == 0) {
            y = true;
        } else {
            y = false;
        }

        System.out.println(y);
    }
}
