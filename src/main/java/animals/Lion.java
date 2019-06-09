package animals;

import java.util.Scanner;

public class Lion extends Animal implements Cat{

    Scanner scanner = new Scanner(System.in);
    int daysWithoutFood = 0;
    int daysToBeHungry=2;

    private boolean CREATE_ANIMAL=false;
    public Lion() {
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
            this.name = "Lewcio";
            this.age = 15;
            this.age = 280;
        }
    }

    public boolean isHungry(int daysWithoutFood) {
        if (daysWithoutFood > daysToBeHungry)
            return true;
        return false;
    }
}

