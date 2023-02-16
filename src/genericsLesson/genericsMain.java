package genericsLesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class genericsMain {
    public static void main (String[] args) {

        //Написать метод, который меняет два элемента массива местами
        String[] array = new String[]{"One", "Two"};
        String a = array[0];
        array[0] = array[1];
        array[1] = a;
        System.out.println(Arrays.toString(array));

        //Ещё нарыл такой способ решения, через метод Collections.swap
        ArrayList <String> arrList = new ArrayList<String>();
        arrList.add("One");
        arrList.add("Two");
        arrList.add("Three");
        arrList.add("Four");
        System.out.println(arrList);

        Collections.swap(arrList, 1, 2);
        System.out.println(arrList);
    }


}
