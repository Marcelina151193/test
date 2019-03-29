package lesson7;

import java.util.*;

public class MapTask1 {
    // Stwórz mapę, która jako klucze będzie zawierała obiekty Integer, a jako wartości obiekty typu String.
    // Wypisz na ekran rozmiar mapy oraz wszystkie wartości (klucz - wartość).

    public static void main(String[] args) {
        Map<Integer, String> integerMap = new HashMap<>(); // Integer nie int!!!

        integerMap.put(1, "one");
        integerMap.put(2, "two");
        integerMap.put(3, "three");

        System.out.println(integerMap.size());

        Set<Integer> keys = integerMap.keySet(); //Integer nie int!!!
        for (Integer key : keys) {    //skrót iter
            System.out.println(integerMap.get(key));
        }

        //Policz w mapie z pkt 1 (za pomocą pętli) ilość kluczy, które mają wartość mniejszą od zera oraz takich
        // które mają wartość większą lub równą zeru. Wypisz wyniki na ekran.

        int k = 0;
        for (Integer key : keys) {

            if (key > 0) {
                k++;
            }


        }
        System.out.println("Ilość większych od 0: " + k);

        // Z mapy stworzonej w pkt 1 wyciągnij wszystkie klucze, które mają wartość mniejszą od zera i dodaj je do nowej
        // listy obiektów Integer. Następnie usuń z mapy wszystkie wartości, których klucze znajdują się w liście.
        // Wypisz wszystkie pozostałe wartości mapy (klucz - wartość) na ekran.

        //  for (Integer key : keys) { //crl+J -> iter z klawiatury
        // if (key<0){
        // integerMap.remove(key) ---> nie można w trakcie przeglądania zbioru zmieniać tego zbioru

        List<Integer> negativeNumbers = new ArrayList<>();
        for (Integer key : integerMap.keySet()) {
            if (key < 0) {
                negativeNumbers.add(key);
            }
            for (Integer negativeNumber : negativeNumbers) {
                integerMap.remove(negativeNumber);
            }
            System.out.println(integerMap);  // można tak przejrzeć mapę (toString wbudowane)

        }

    }
}