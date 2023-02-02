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
        phonebook.addNameAndPhone("Аброшкин", 89276993355);
        phonebook.addNameAndPhone("Федосеев", 89276993380);
        phonebook.addNameAndPhone("Заборников", 89276993367);
        phonebook.addNameAndPhone("Семёнов", 89276993354);
        phonebook.addNameAndPhone("Аброшкин", 89276993312);
        phonebook.addNameAndPhone("Аброшкин", 89276993308);
        phonebook.addNameAndPhone("Васильченко", 89276993377);
        phonebook.addNameAndPhone("Муратьев", 89276993344);
        phonebook.addNameAndPhone("Дудуло", 89276993399);
    }

}
