package genericsLesson;

import java.util.ArrayList;

public class Box<S extends Fruit> {

    private final ArrayList<S> fruits = new ArrayList<>();

    public void addFruit(S fruit) {
        fruits.add(fruit);
    }

    public double getWeightInBox() {
        S fruit = fruits.get(0);
        return fruits.size() * fruit.getWeight();
    }

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