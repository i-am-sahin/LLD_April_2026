package lld1_april_2026.copyConstructor;

public class Student {
    private String name;
    private int age;
    private double psp;
    private Address address;

    public Student(String name,  int age, double psp,Address address) {
        this.name = name;
        this.psp = psp;
        this.age = age;
        this.address = address;
    }

    // This is a Deep constructor
    public Student(Student other){
        this.name = other.name;  // s2.name = s1.name;
        this.age = other.age;
        this.psp = other.psp;
        //Create new address with the same values.
        this.address = new Address(other.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
