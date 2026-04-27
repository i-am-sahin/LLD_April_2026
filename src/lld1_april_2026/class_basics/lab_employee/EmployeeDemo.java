package lld1_april_2026.class_basics.lab_employee;

public class EmployeeDemo {
    static void main() {

//        Employee emp1 = new Employee("EMP001", "Rahul Sharma", "rahul@google.com", "Engineering", 1200000, 3);

        Employee emp1 = new Employee();
        emp1.employeeId = "EMP0001";
        emp1.name = "Rahul Sharma";
        emp1.email = "rahul@company.com";
        emp1.department = "Engineering";
        emp1.salary = 120000.00;
        emp1.yearsOfExperience = 3;

        Employee emp2 = new Employee();
        emp2.employeeId = "EMP0002";
        emp2.name = "Pirya Verma";
        emp2.email = "priya@company.com";
        emp2.department = "Product";
        emp2.salary = 1500000;
        emp2.yearsOfExperience = 5;

        Employee emp3 = new Employee();
        emp3.employeeId = "EMP0003";
        emp3.name = "Amit Kumar";
        emp3.email = "amit@company.com";
        emp3.department = "Engineering";
        emp3.salary = 800000;
        emp3.yearsOfExperience = 1;

        //Test behaviors
        emp1.displayInfo();
        emp1.getPromotion(15); // 15% raise
        emp1.changeDepartment("Platform");
        emp1.displayInfo();

        emp3.getPromotion(20); // 20% raise
    }
}
