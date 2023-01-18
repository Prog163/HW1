package exceptionsLesson;

import exceptionsLesson.exceptions.MyArraySizeException;

public class methodArray {
     String[][] methodArray = new String[][]{{"1", "2", "3", "4"}, {"4", "3", "2","1"}, {"1", "2", "2"}, {"2", "1", "1", "ABC"}};
     try {
        System.out.println(methodArray.length);
    } catch (MyArraySizeException e) {
        System.out.println("Размер должен соответствовать 4*4!");
    }

     public class elementsAndSum(String[][] methodArray) {

     }
}
