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

    public static void allPhonebook(){
        Phonebook phonebook = new Phonebook();
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993355);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993380);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993367);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993355);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993312);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993308);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993377);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993344);
        phonebook.addNameAndPhone("Василий Иванович Аброшкин", 89276993399);
    }

}
