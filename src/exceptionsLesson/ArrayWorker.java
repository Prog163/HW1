package exceptionsLesson;

import exceptionsLesson.exceptions.MyArrayDataException;
import exceptionsLesson.exceptions.MyArraySizeException;

public class ArrayWorker {
    private String[][] arrayOfStrings = new String[][]{{"1", "2", "3", "4"}, {"A", "3", "2", "1"}, {"2", "1", "1"}, {"2", "1", "1", "2"}};

    public void elementsOfArray() throws MyArrayDataException, MyArraySizeException {

        checkSizeArray();

        int result = 0;
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = 0; j < arrayOfStrings[i].length; j++) {
                String currentString = arrayOfStrings[i][j];
                try {
                    Integer currentInt = Integer.parseInt(currentString);
                    result = result + currentInt;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неправильный символ в ячейке массива " + i + " " + j);
                }
            }
        }
        System.out.println(result);
    }

    private void checkSizeArray() throws MyArraySizeException {
        int length = arrayOfStrings.length;
        if (length != 4) {
            throw new MyArraySizeException("Размер должен быть равен: 4, в данный момент он равен: " + length);
        }

        for (int i = 0; i < arrayOfStrings.length; i++) {
            int currentArrayLength = arrayOfStrings[i].length;
            if (currentArrayLength != 4)
                throw new MyArraySizeException("Размер должен быть равен: 4, в данный момент он равен: " + currentArrayLength);
        }
    }
}
