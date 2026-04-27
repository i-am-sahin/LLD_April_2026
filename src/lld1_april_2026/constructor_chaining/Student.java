package lld1_april_2026.constructor_chaining;

public class Student {
    private String name;
    private int age;
    private double psp;



    public Student(){
        this("Unknown",0,0.0); // This function pointing to the three param constructor.
        System.out.println("No-args constructor.");
    }

    public Student(String name){
//        this.name = name;
        //Or
        this(name,0,0.0); // this needs to be the 1st statement in the constructor.
        System.out.println("Name-only constructor finished");
    }

    public Student(String name, int age, double psp){
        System.out.println("this: " + this);
        this.name = name;
        this.age = age;
        this.psp = psp;
        System.out.println("Full constructor - assigned all values");
    }
}
