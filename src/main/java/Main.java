import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        System.out.println(cheetah.toString());

        Tiger tiger = new Tiger.TigerBuilder("Tymon", 10).build();
        System.out.println(tiger.toString());
        Tiger tiger2 = new Tiger.TigerBuilder("Tomasz", 13).build();
        System.out.println(tiger2);
        boolean isTigerHungry = tiger.isHungry(2);
        System.out.println(isTigerHungry);

        Lion lion = new Lion();
        Kitten kitten = new Kitten();
        System.out.println(kitten.toString());

        List<Animal> animals = new ArrayList<>();
        animals.add(tiger);
        animals.add(tiger2);
        animals.add(cheetah);
        animals.add(lion);

        System.out.println(animals.toArray());
        for (Animal animal : animals) {
            System.out.println(animal);

            Zoo zoo = Zoo.getInstance();
//            zoo.createZoo();
            zoo.createTigers();
//            System.out.println(tiger.compareTo(tiger2));

        }
    }
}

