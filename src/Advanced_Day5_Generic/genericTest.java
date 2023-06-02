package Advanced_Day5_Generic;

import java.util.ArrayList;

public class genericTest {

    public static void main(String[] args) {
        ArrayList<Cat> animals = new ArrayList<>();
        animals.add(new bosiCat("张三", 18));
        animals.add(new lihuaCat("李四", 19));
//        animals.add(new teddyDog("王五",20));
//        animals.add(new hashiDog("老六",21));

//        ArrayList<Dog> animals2 = new ArrayList<>();

        keepPet(animals);
    }

    public static void keepPet(ArrayList<? extends Cat> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
