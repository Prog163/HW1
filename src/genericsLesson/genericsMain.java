package genericsLesson;

import java.util.Arrays;

public class genericsMain {
    public static void main (String[] args) {

        //Написать метод, который меняет два элемента массива местами
        String[] array = new String[]{"One", "Two"};
        String a = array[0];
        array[0] = array[1];
        array[1] = a;
        System.out.println(Arrays.toString(array));

    }


}
