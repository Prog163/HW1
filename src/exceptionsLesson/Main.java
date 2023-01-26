package exceptionsLesson;

import exceptionsLesson.exceptions.MyArrayDataException;
import exceptionsLesson.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] args) {
        ArrayWorker arrayWorker = new ArrayWorker();
        try {
            arrayWorker.elementsOfArray();
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
