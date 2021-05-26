package lesson3.hw3;

import java.util.Arrays;

public class Main {
    public static void changeArrayElements(Object[] array, int i, int j) {
        Object tempElement = array[i];
        array[i] = array[j];
        array[j] = tempElement;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 6, 7, 8, 9, 5};
        changeArrayElements(array, 0, 2);
        System.out.println(Arrays.toString(array));

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println(appleBox.compare(appleBox2));

        appleBox.transferFruits(appleBox2);
        //appleBox.transferFruits(appleBox);
        System.out.println(appleBox);
        System.out.println(appleBox2);

//        Box<Orange> orangeBox = new Box<>();
//        orangeBox.addFruit(new Orange());
//        orangeBox.addFruit(new Orange());
//        orangeBox.addFruit(new Orange());
//        orangeBox.addFruit(new Orange());
//
//        Box<Orange> orangeBox2 = new Box<>();
//        orangeBox2.addFruit(new Orange());
//        orangeBox2.addFruit(new Orange());
//        orangeBox2.addFruit(new Orange());
//        orangeBox2.addFruit(new Orange());
//
//        System.out.println(orangeBox.compare(orangeBox2));
//
//
//        orangeBox.transferFruits(orangeBox2);
//        orangeBox.transferFruits(orangeBox);
//
//        System.out.println(orangeBox);
//        System.out.println(orangeBox2);
    }
}
