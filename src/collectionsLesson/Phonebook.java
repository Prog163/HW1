package collectionsLesson;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public HashMap<String, Integer> phonebook = new HashMap<>();

    public void addNameAndPhone(String name, int phone){
        this.name = name;
        this.phone = phone;
    }

    public Set<String> getName(String name){
        return phonebook.get(name);
    }

}
