package animals;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    protected int age;
    protected double weight;

    public Animal() {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected double getWeightToAgeRatio() {
        return this.weight / this.age;
    }

    @Override
    public String toString() {
        return "Animal: " +
                " name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Animal animalToCompare) {
        double ratio = getWeightToAgeRatio();
        double ratioToCompare = animalToCompare.getWeightToAgeRatio();
        if (ratio == ratioToCompare)
            return 0;
        else if (ratio < ratioToCompare)
            return 1;
        else
            return -1;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return age == animal.age &&
//                Double.compare(animal.weight, weight) == 0 &&
//                Objects.equals(name, animal.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, weight);
//    }
}
