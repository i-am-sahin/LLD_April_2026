package lld1_april_2026.copyConstructor;

public class DeepCopyDemo {
    static void main() {
        System.out.println(" === SHALLOW COPY Constructor === \n");
        Address addr1 = new Address("Mumbai","India");

        StudentShallow s1 = new StudentShallow("Manvendra",20,99.2,addr1);

        StudentShallow s2 = new StudentShallow(s1); // Shallow Copy

        System.out.println("Before : s1.city : "  + s1.getAddress().getCity());
        System.out.println("Before : s2.city : "  + s2.getAddress().getCity());

        s2.getAddress().setCity("Kolkata");

        System.out.println("After S2's city is changed to Kolkata");

        System.out.println("  s1.city : "  + s1.getAddress().getCity());
        System.out.println("  s2.city : "  + s2.getAddress().getCity());


        //DEEP COPY solution


        Address addr2 = new Address("Mumbai","India");
        Student s3 = new Student("Sahin", 23, 55, addr2);
        Student s4 = new Student(s3);


        System.out.println("Before : s3.city : "  + s3.getAddress().getCity());
        System.out.println("Before : s4.city : "  + s4.getAddress().getCity());

        s4.getAddress().setCity("Kolkata");

        System.out.println("After S4's city is changed to Kolkata");

        System.out.println("  s3.city : "  + s3.getAddress().getCity());
        System.out.println("  s4.city : "  + s4.getAddress().getCity());


    }
}
