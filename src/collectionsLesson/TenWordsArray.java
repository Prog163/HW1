package collectionsLesson;

import java.util.HashMap;
import java.util.Map;

public class TenWordsArray {
    private String[] wordsArray;

    public TenWordsArray(String[] wordsArray) {
        this.wordsArray = wordsArray;
    }

    public void uniqueWords() {
        HashMap<String, Integer> unique = new HashMap(wordsArray);

        for (Map.Entry<String, Integer> u : unique.entrySet()) {
            if (u.getValue().equals(1)) {
                System.out.println(u.getKey());
            }
        }
    }
}
