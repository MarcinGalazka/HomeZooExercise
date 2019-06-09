package animals;

import java.util.Scanner;

public class Cheetah extends Animal implements Cat {
//    private String name;
//    private int age;
//    private double weight;

    Scanner scanner = new Scanner(System.in);

    private boolean CREATE_ANIMAL=false;
    int daysWithoutFood = 0;
    int daysToBeHungry=1;


    public Cheetah() {
//        System.out.println("Do you want to create an animal?");
        if(CREATE_ANIMAL) {
            try {
                System.out.println("Set name ");
                this.name = scanner.next();
                System.out.println("Set age ");
                this.age = scanner.nextInt();
                System.out.println("Set weight ");
                this.weight = scanner.nextDouble();
            } catch (Exception e){
                System.out.println("Incorrect data format");
            }
        }
        else {
            this.name = "Gepcio";
            this.age = 12;
            this.weight = 201;
        }
    }

    public boolean isHungry(int daysWithoutFood) {
        if (daysWithoutFood > daysToBeHungry)
            return true;
        return false;
    }


//
//
}
