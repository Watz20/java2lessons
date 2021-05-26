package lesson3.hw3;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public void addFruit(Apple fruit) {
        fruitList.add((T) fruit);
    }

    public float getBoxWeight() {
        return fruitList.size() * fruitList.get(0).weight;
    }

    public boolean compare(Box<?> box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public void transferFruits(Box<Apple> box) {
        fruitList.addAll((Collection<? extends T>) box.fruitList);
        box.fruitList.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }

    public void addFruit(Orange orange) {
    }
}
