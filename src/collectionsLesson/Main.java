package collectionsLesson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        makeThePhonebook();

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
    public static void makeThePhonebook() {

        Phonebook phonebook = new Phonebook();
        phonebook.addNewStringPhoneBook("Vasya", "89276955532");
        phonebook.addNewStringPhoneBook("Anton", "89276956985");
        phonebook.addNewStringPhoneBook("Dasha", "89276957895");
        phonebook.addNewStringPhoneBook("Vasya", "89276654123"); //Vasya с другим номером
        phonebook.addNewStringPhoneBook("Sasha", "89987456321");

        System.out.println("Dasha: " + phonebook.getStringInPhonebook("Dasha"));
        System.out.println("Vasya: " + phonebook.getStringInPhonebook("Vasya"));
    }
}
