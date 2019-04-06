package lesson1_part1;

public class Zadanie4 {
    public static void main(String[] args) {
        // napisz, program, który utworzy jedną zmienną i wyrzuci true, jeśli jest podzielna przez 3 i przez 5
        // lub false w  przeciwnym wypadku
        int x = 10;
        boolean y;
        if ((x % 3 == 0) && (x % 5 == 0)) {
            y = true;
        } else{
            y = false;
        }
        System.out.println(y);
    }
}
