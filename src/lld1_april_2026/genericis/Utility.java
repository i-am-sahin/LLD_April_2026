package lld1_april_2026.genericis;

public class Utility {

    // <T> Before the return type declares the T as a type parameter for the method. This means that T can be used as a placeholder for any reference type (like String, Integer, etc.) when the method is called. The actual type will be determined by the caller based on the type of the argument passed to the method.
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Important : Generics are only applicable to reference types. They cannot be used with primitive types like int, double, etc. If you want to use generics with primitive types, you can use their wrapper classes (like Integer for int, Double for double, etc.) instead.

    public static <T> T getFirst(T[] array){
        if(array.length == 0 || array == null){
            return null;
        }
        return array[0];
    }



    public static <T,V> Pair makePair(T first, V second){
        return new Pair<>(first, second);
    }

    // A method with no parameters
    public static <T> T getDefault(){
        return null;
    }





//    public static  void printArray(int[] array){
//        for(int item : array){
//            System.out.print(item + " ");
//        }
//        System.out.println();
//    }
}

/*
<T> -> It declares the type Parameter
T (Second One)-> Return Type of the method
T[] array -> Parameter type of the method
 */