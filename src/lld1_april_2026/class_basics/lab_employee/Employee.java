package lld1_april_2026.class_basics.lab_employee;

/*
Problem Statement
A company needs to manage its employees. Design an Employee class.

Requirements:
Every employee has:

Employee ID (unique)
Name
Email
Department
Salary
Years of experience

An employee can:

Get a promotion (increase salary by a given percentage)
Change department
Display their details

Create at least 3 employee objects and demonstrate all behaviors.
 */
public class Employee {
    String employeeId;
    String name;
    String email;
    String department;
    double salary;
    double yearsOfExperience;


    //default Constructor : Java automatically Generates this & assigns all the attributes to it's default value.
    Employee(){
        employeeId = null;
        name = null;
        email = null;
        department = null;
        salary = 0.0;
        yearsOfExperience = 0.0;
    }
    void getPromotion(double percentage){
        if(percentage < 0){
            System.out.println("Invalid percentage");
            return;
        }
        salary += (salary * (percentage / 100)) ;
        System.out.println("Congratulations, You just got promoted & got " + percentage + " salary hike. Now Your salary is " + salary);

    }
    void changeDepartment(String newDepartment){
        department = newDepartment;
        System.out.println("You're shifted to new department. Your new department is: "+ department);

    }
    void displayInfo(){
        System.out.println("=== Employee Details ===");
        System.out.println("ID: "+ employeeId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Years Of Experience: "+ yearsOfExperience);
        System.out.println("=====================");
    }
}
