package collectionsLesson;

import java.util.HashMap;
import java.util.Map;

public class TenWordsArray {
    public String[] wordsArray;

    public TenWordsArray(String[] wordsArray) {
        this.wordsArray = wordsArray;
    }

    public void uniqueWords() {
        HashMap<String, Integer> uniqueWords = new HashMap<>();
        for (Map.Entry<String, Integer> u : uniqueWords.entrySet()) {
            if (u.getValue().equals(1)) {
                System.out.println(u.getKey());
            }
        }
    }
}
