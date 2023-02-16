package genericsLesson;

import genericsLesson.readyHomework.BoxFruit;

import java.util.ArrayList;

public class Box<S> {
    private final double weightFruit;

    ArrayList <S> fruits = new ArrayList<>();
    public void addFruit(S fruit){
        fruits.add(fruit);
    }
    public <F> Box(double weightFruit) {
        this.weightFruit= weightFruit;
    }
    public double getWeightInBox(){
        return fruits.size() * weightFruit;
    }
    //Списал, не понимаю тему с Math.abs
    public boolean compare(Box<?> box){
        return Math.abs(getWeightInBox() - box.getWeightInBox()) < 0.00001;
    }

    public void addFruits(Box<S> box){
        fruits.addAll(box.fruits);
    }
}
