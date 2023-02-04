package collectionsLesson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] strings = new String[]{"Book", "Book", "Book", "Apple", "Head", "Phone", "Apple", "Sea", "Shark", "Mouse"};
        for (int i = 0; i < strings.length; i++) {
            String currentKey = strings[i];
            Integer currentValue = map.get(currentKey);
            if (currentValue == null) {
                map.put(currentKey, 1);
            } else {
                map.put(currentKey, currentValue + 1);
            }
        }
        printMap(map);
        // TODO: Вывести в консоль уникальные слова
        System.out.println("Уникальные слова в списке: ");
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getValue().equals(1)) {
                System.out.println(pair.getKey());
            }
        }
    }
    public static void printMap(HashMap<String, Integer> map) {
        for (Map.Entry pair : map.entrySet()) {
            System.out.println("Key: " + pair.getKey() + " | Value: " + pair.getValue());
        }
    }
}
