package genericsLesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class genericsMain {
    public static void main(String[] args) {
        fruitsAddBox();

        //TODO: Написать метод, который меняет два элемента массива местами
        String[] array = new String[]{"One", "Two"};
        String a = array[0];
        array[0] = array[1];
        array[1] = a;
        System.out.println(Arrays.toString(array));

        //Ещё нарыл такой способ решения, через метод Collections.swap
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("One");
        arrList.add("Two");
        arrList.add("Three");
        arrList.add("Four");
        System.out.println("Изначальный вид: " + arrList);

        Collections.swap(arrList, 1, 2);
        System.out.println("Замена местами : " + arrList);
    }

    //Создаём и складываем фрукты в BOX
    public static void fruitsAddBox() {
        Box<Apple> apple = new Box<Apple>(1);
        Box<Orange> orange = new Box<Orange>(1.5);
        Box<Apple> apple2 = new Box<Apple>(1);

        for (int i = 0; i < 3; i++) {
            apple.addFruit(new Apple());
            orange.addFruit(new Orange());
            apple2.addFruit(new Apple());
        }
        System.out.println(apple.getWeightInBox());
        System.out.println(orange.getWeightInBox());
        System.out.println(apple.compare(orange));

        apple.addFruits(apple2);
    }
}
