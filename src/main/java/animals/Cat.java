package animals;

public interface Cat  {
    int daysWithoutFood = 0;
    int daysToBeHungry=0;
    public default boolean isHungry(int daysWithoutFood, int daysToBeHungry)  {
        if (daysWithoutFood>daysToBeHungry)
            return true;
        return false;
    }

}
