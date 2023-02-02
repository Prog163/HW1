package collectionsLesson;

import java.util.HashMap;
import java.util.Map;

public class TenWordsArray {
    public String[] wordsArray;

    public TenWordsArray(String[] wordsArray) {
        this.wordsArray = wordsArray;
    }

    public void uniqueWords() {
        //Здесь списал getUniqueWords(wordsArray), не понимаю почему так пишется
        HashMap<String, Integer> uniqueWords = getUniqueWords(wordsArray);
        for (Map.Entry<String, Integer> u : uniqueWords.entrySet()) {
            if (u.getValue().equals(1)) {
                System.out.println(u.getKey());
            }
        }
    }
        //Это тупо списал, не понимаю код
        private HashMap<String, Integer> getUniqueWords(String[] wordsArray) {
            HashMap<String, Integer> uniqueWords = new HashMap<>();

            for (int i = 0; i < wordsArray.length; i++) {
                if (uniqueWords.containsKey(wordsArray[i])) {
                    uniqueWords.put(wordsArray[1], uniqueWords.get(wordsArray[1]) + 1);
                } else {
                    uniqueWords.put(wordsArray[i], 1);
                }
            }
            return uniqueWords;
        }
    }

