package lld1_april_2026.class_basics;

public class Main {
    public static void main() {
        Student rahul = new Student(); // Object 1 - occupies memory
        rahul.name = "Rahul";
        rahul.age = 22;
        rahul.batch = "FEB 2026";
        rahul.psp = 78.5;


        Student priya = new Student(); // Object 2 - occupies memory
        priya.name = "Priya";
        priya.age = 24;
        priya.batch = "FEB 2026";
        priya.psp = 92.3;

        Student amit = new Student(); // Object 2 - occupies memory
        amit.name = "Amit";
        amit.age = 21;
        amit.batch = "Mar 2026";
        amit.psp = 65.0;
        Student pankaj = new Student();

        System.out.println(rahul.name);
        System.out.println(priya.name);
        System.out.println(amit.name);


        //These 2 print the default value of the attribute / data member's variable because those are not defined in the object.
        System.out.println(pankaj.name);
        System.out.println(pankaj.psp);

        System.out.println("DEBUG");
    }
}
