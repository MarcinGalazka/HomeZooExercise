import animals.Animal;
import animals.Cheetah;
import animals.Lion;
import animals.Tiger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Zoo {
    private Zoo(){}
    private static class SingletonHelper{
        private static final Zoo INSTANCE = new Zoo();
    }
    public static Zoo getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private String name;
    private String address;
    Set<Animal> animals;


    public void createZoo(){
        createTigers();
        createLions();
        createLions();

    }

    public Set<Tiger> createTigers(){

        Set<Tiger> tigers = new HashSet<>();
        Tiger tiger1= new Tiger.TigerBuilder("Tymek",10).build();
        Tiger tiger2= new Tiger.TigerBuilder("Tamara",9).build();
        Tiger tiger3= new Tiger.TigerBuilder("Tobiasz",8).build();

        tigers.add(tiger1);
        tigers.add(tiger2);
        tigers.add(tiger3);
//        for(Tiger tiger : tigers){
//            System.out.println(tiger);
//
//        }
        return tigers;}

    public Set<Animal> createLions(){
        Lion lion1 = new Lion();
        animals.add(lion1);
        return animals;
    }

    public Set<Animal> createCheetahs(){
        Cheetah cheetah = new Cheetah();
        animals.add(cheetah);
        return animals;
    }
}
