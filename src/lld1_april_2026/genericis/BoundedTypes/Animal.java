package lld1_april_2026.genericis.BoundedTypes;

import java.util.List;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }

    // This method only accepts a List<Animal>. It can not pass List<Dog> or List<Cat> to this method because they are not subtypes of List<Animal>.
//    public void feedAnimal(List<Animal> animals){
//        for (Animal animal : animals){
//            animal.eat();
//        }
//    }



}

