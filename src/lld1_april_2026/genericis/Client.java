package lld1_april_2026.genericis;

public class Client {
    static void main(String[] args) {
        // Store the name(String) + score(Integer) combination
        Pair<String, Integer> studentData = new Pair<>("Sahin",95);

       // studentData.setFirst(95);  // Here we are trying to set the first element of the Pair to an Integer value, which is not type-safe since the first element was originally a String. This can lead to runtime errors when we try to retrieve it as a String later.
        String name =  studentData.getFirst(); // we can safely retrieve the first element as a String without any type casting, thanks to generics.


        //This is Called raw type. -> This is what we had before java 5.0. This is not type safe and can lead to runtime errors.
        Pair<String, Integer> pair = new Pair<>("admin",12);
        pair.getDefaultFirst();



        String[] names = {"Sahin", "John", "Doe"};
         Integer[] scores = {95, 85, 75};
         Utility.printArray(names); //Here, T is inferred as String because we are passing a String array. The method will print each name in the array.
         Utility.getFirst(names); // Return "Sahin"
         Utility.printArray(scores); // Here, T is inferred as Integer because we are passing an Integer array. The method will print each score in the array.
         Utility.getFirst(scores); //Return 95


        // Important : Generics are only applicable to reference types. They cannot be used with primitive types like int, double, etc. If you want to use generics with primitive types, you can use their wrapper classes (like Integer for int, Double for double, etc.) instead.


        Pair<Integer,String> pair1 = Utility.makePair(1,"Sahin");

        // Usage -> Must Explicitly specify the type parameter T when calling the method. This is because the method has no parameters, so the compiler cannot infer the type from the arguments. Therefore, we need to explicitly specify the type parameter T when calling the method.

        String s = Utility.<String>getDefault(); // Here, we are explicitly specifying the type parameter T as String. The method will return null, but it will be of type String.
        Integer i = Utility.<Integer>getDefault(); // Here, we are explicitly specifying the type parameter T as Integer. The method will return null, but it will be of type Integer.
    }
    /*
        1. There is no Type safety.
        2. Manual type casting is required. :- (String) studentData.getFirst();
        3. Runtime bombs :- Errors will only come to surface when the code runs and some edge cases are hit. (For example, if we try to retrieve the first element as a String after setting it to an Integer, it will throw a ClassCastException at runtime.)

        Generic were introduced in Java 5(2004) to overcome these issues. With generics, we can specify the type of the elements in a collection or a class, which provides compile-time type safety and eliminates the need for manual type casting.
     */
}
