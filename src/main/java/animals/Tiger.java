package animals;

import java.util.Random;

public class Tiger extends Animal implements Cat {
    int daysWithoutFood = 0;
    int daysToBeHungry = 3;


    public Tiger(TigerBuilder builder) {

        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
    }


    public static class TigerBuilder {
        public static final int MAX_WEIGHT = 100;
        Random random = new Random();
        private String name;
        private int age;
        private double weight;

        public TigerBuilder(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = random.nextInt(MAX_WEIGHT);
        }

        public Tiger build() {
            return new Tiger(this);
        }
    }


    public boolean isHungry(int daysWithoutFood) {
        if (daysWithoutFood > daysToBeHungry)
            return true;
        return false;
    }
}

