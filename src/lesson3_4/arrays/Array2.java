package lesson3_4.arrays;

public class Array2 {
    // Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.


    public Array2() {
    }

    public int sum(int[] table2) {
        int s = table2[0];

        for (int i = 1; i < table2.length; i++) {
            s = s + table2[i];
        }
        return s;
    }

}
