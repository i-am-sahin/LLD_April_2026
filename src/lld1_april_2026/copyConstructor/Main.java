package lld1_april_2026.copyConstructor;

public class Main {
    static void main() {

        Address s1Address = new Address("Kolkata","India");
        Student s1 = new Student("Priya", 22, 87.6,s1Address);

        //Shallow Copy
        Student s2 = new Student(s1);
//        Student s2 = s1; // s2 is pointing to s1's memory address, if i change any value in s2,it's also change in s1.Because both are shareing same memory address.
        System.out.println("s1: " + s1.getName());
        System.out.println("s2: " + s2.getName());
        s1.setName("Manvendra");

        System.out.println("s1: " + s1.getName());
        System.out.println("s2: " + s2.getName());

        s1.getAddress().setCity("Delhi");
        System.out.println(s1.getAddress().getCity()); // Delhi
        System.out.println(s2.getAddress().getCity()); //Delhi
    }
}
