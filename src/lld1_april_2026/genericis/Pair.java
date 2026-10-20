package lld1_april_2026.genericis;

public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }


    public void setSecond(V second) {
        this.second = second;
    }

    // This gives me a compile time error because we cannot use the type parameter T in a static context. Because If the object is not created, then T is not defined. So, we cannot use it in a static context. Because static members belong to the class, not to any specific instance of the class(That's why it Created even before the object initialization). Therefore, they cannot access instance-specific type parameters like T.
//    public static T getDefaultFirst(){
//        return null;
//    }

    public  T getDefaultFirst(){
        return null;
    }
}

/*
    Generics use this kind of names convention for type parameters:
    T - Type (For General Type)
    V - Value(sort of general type)
    E - Element (used extensively by the Java Collections Framework)
    K - Key
    N - Number
    Apart from these, we can write anything there.But it is a good practice to use these names for better readability and understanding of the code.

 */