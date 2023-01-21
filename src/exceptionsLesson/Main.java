package exceptionsLesson;

import exceptionsLesson.exceptions.MyArrayDataException;

public class Main {

    public static void main(String[] args) {
        ArrayWorker arrayWorker = new ArrayWorker();
        try {
            arrayWorker.elementsOfArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
