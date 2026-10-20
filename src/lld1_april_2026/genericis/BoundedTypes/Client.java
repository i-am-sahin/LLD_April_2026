package lld1_april_2026.genericis.BoundedTypes;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

//        List<Animal>  animals   = dogs; // This line will cause a compile-time error because List<Dog> is not a subtype of List<Animal>

        Utility utility = new Utility();
        utility.feedAnimal(List.of(new Animal(), new Dog(), new Cat())); // This works because List.of(...) returns a List<Animal>
        utility.feedAnimal(dogs); // This works because feedAnimal accepts List<? extends Animal>

        utility.feedAnimal(cats);


        utility.addDogs(dogs);




    }
}
