package collectionsLesson;

public class Main {
    public static void main(String[] args) {
        TenWordsArray tenWordsArray = new TenWordsArray(wordsArray());
        tenWordsArray.uniqueWords();
    }

    public static String [] wordsArray() {
        String[] words = {"Book", "Book", "Book", "Apple", "Head", "Phone", "Apple", "Sea", "Shark", "Mouse"};
        return words;
    }

}
