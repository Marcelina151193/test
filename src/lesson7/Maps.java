package lesson7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> vocabulary = new HashMap<>();

        //dodawanie

        vocabulary.put("jabłko", "apple");
        vocabulary.put("banan", "banana");
        vocabulary.put("pomarańcza", "orange");

        //sprawdzanie

        System.out.println(vocabulary.containsKey("jabłko"));
        System.out.println(vocabulary.containsValue("apple"));
        System.out.println(vocabulary.containsKey("gruszka"));

        //pobieranie wartości na podstawie klucza

        String jabłkoinEnglish = vocabulary.get("jabłko");
        System.out.println("Jabłko in English: " + jabłkoinEnglish);

        //usuwanie elementów

        String removed = vocabulary.remove("banan");
        System.out.println(vocabulary.get("banan"));

        Set<String> keys = vocabulary.keySet();
        for (String key : keys) {
            System.out.println(vocabulary.get(key));

        }
    }

}

