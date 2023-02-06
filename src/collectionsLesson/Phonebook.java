package collectionsLesson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addNewStringPhoneBook(String name, String phone) {
        HashSet<String> phones;
        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        } else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll(" ",""));
        phoneBook.put(name, phones);
    }
    public Set<String> getStringInPhonebook (String name) {
        return phoneBook.get(name);
    }
}
