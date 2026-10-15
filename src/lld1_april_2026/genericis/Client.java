package lld1_april_2026.genericis;

public class Client {
    static void main(String[] args) {
        // Store the name(String) + score(Integer) combination
        Pair studentData = new Pair("Sahin",95);

        studentData.setFirst(95);  // Here we are trying to set the first element of the Pair to an Integer value, which is not type-safe since the first element was originally a String. This can lead to runtime errors when we try to retrieve it as a String later.
        String name = (String) studentData.getFirst();
    }
    /*
        1. There is no Type safety.
        2. Manual type casting is required. :- (String) studentData.getFirst();
        3. Runtime bombs :- Errors will only come to surface when the code runs and some edge cases are hit. (For example, if we try to retrieve the first element as a String after setting it to an Integer, it will throw a ClassCastException at runtime.)

        Generic were introduced in Java 5(2004) to overcome these issues. With generics, we can specify the type of the elements in a collection or a class, which provides compile-time type safety and eliminates the need for manual type casting.
     */
}
