package lld1_april_2026.genericis.BoundedTypes;

import java.util.List;

public class Utility {
    // ? extends T --> This is called an upper bounded wildcard. It allows you to pass a List of any type that is a subtype of Animal (including Animal itself) to the method.



    // Here this extends anything Which extends Animal.

    //    Animal is an upper bound -> All children are allowed to be passed to this method. This is called an upper bounded wildcard.
    public void feedAnimal(List<? extends Animal> animals){
        for (Animal animal : animals){
            // Weather It is a dog, a cat or an animal - they are all animals.
            // So assigning to an Animal variable always works.
            animal.eat();
        }
    }


//    public  void feedAnimal2(List<? extends Animal> animals){ // List<Animal>, List<Dog>, List<Cat> are all valid arguments for this method.
//
//        animals.add(new Dog());//  This line will cause a compile-time error because you cannot add elements to a List<? extends Animal> since the exact type is unknown. The only thing you can safely add is null.
//    }

        // Here List<Dogs>, List<Mammal>, List<Animal> and List<Object> are all valid arguments for this method. This is called a lower bounded wildcard.
    public void addDogs(List<? super Dog> dogs) {
        //Safe to add Dog
        dogs.add(new Dog()); // This works because we know that the list can hold Dog objects or any of its supertypes.

    }
}

/*
? super T --> this is called a lower bounded wildcard.
 */
