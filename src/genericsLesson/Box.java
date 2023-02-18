package genericsLesson;

import java.util.ArrayList;

public class Box<S extends Fruit> {
    private final double weightFruit;
    private ArrayList<S> fruits = new ArrayList<>();

    public Box(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(S fruit) {
        fruits.add(fruit);
    }

    public double getWeightInBox() {
        return fruits.size() * weightFruit;
    }

    //Списал, не понимаю тему с Math.abs
    public void addFruits(Box<S> box) {
        fruits.addAll(box.fruits);
        box.fruits.clear();
        System.out.println(fruits.size());
        System.out.println(box.fruits.size());
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getWeightInBox() - box.getWeightInBox()) < 0.00001;
    }
}
