package genericsLesson;

import java.util.Arrays;

public class genericsMain {
    public static void main(String[] args) {
        swapArrayElements(new String[]{"One", "Two"}, 0, 1);
        fruitsAddBox();
    }

    public static void swapArrayElements(Object[] array, int i, int j) {
        Object a = array[i];
        array[i] = array[j];
        array[j] = a;
        System.out.println(Arrays.toString(array));
    }

    //Создаём и складываем фрукты в BOX
    public static void fruitsAddBox() {
        Box<Apple> apple = new Box<Apple>();
        Box<Orange> orange = new Box<Orange>();
        Box<Apple> apple2 = new Box<Apple>();

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