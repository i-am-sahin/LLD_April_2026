package lld1_april_2026.inheritance;

public class Main {
    static void main() {
        Student sahin = new Student("S001",
                "sahin",
                "sahinislam878@gmail.com",
                "B2026");

        sahin.logout(); // Inherited form the user class,which is the parent class of student;
        System.out.println(sahin.getUsername());
        sahin.submitAssignment(); // Student-Specific method
        System.out.println("PSP : " + sahin.getPsp()); // Student-Specific method


    }
}
