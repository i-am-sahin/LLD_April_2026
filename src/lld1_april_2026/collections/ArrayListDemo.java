package lld1_april_2026.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        //Add Elements
        students.add("Sahin");
        students.add("Jeet");
        students.add("Samin");
        students.add("Sayak");

        //Indexed access - O(1)
        System.out.println(students.get(0));

        //Size
        System.out.println(students.size());

        //Remove Element by index
        students.remove(1); // Removes "Jeet"

        //Iterate over the list
        for(String s: students){
            System.out.println(s);
        }
    }

}
/*
    Dynamic array - Starts at a Capacity of 10, grows by 50% when the capacity is reached
    Best for :   Random access, Iteration, when you mostly add at the end of the list
 */
