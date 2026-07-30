package lld1_april_2026.polymorphism;

import java.util.Arrays;

public class Main {
    public static void main() {

        User user = new User();
        System.out.println(user.getRole());

        Student sahin = new Student("S1",
                 "sahin",
                "sahinislam878@gmail.com",
                 "dec25");
        sahin.getRole();

        User user1 = new Student(
                "S2",
                "sahin",
                "sahinislam878@gmail.com",
                "dec25"
        );

        User user2 = new Instructor(
                "I001",
                "Amit",
                "amit@scaler.com",
                "Java"
        );
        User user3 = new Mentor(
                "M001",
                "Priya",
                "priya@scaler.com"
        );

        //If not polymorphism You would have to create 3 different methods!
        /*
        * sendWelcomeEmailToStudent(Student s)
        * sendWelcomeEmailToInstructor(Instructor i)
        * sendWelcomeEmailToMentor(Mentor m)
        *
        */
        NotificationService notificationService = new NotificationService();
        notificationService.sendWelcomeNotification(user1);
        notificationService.sendWelcomeNotification(user2);
        notificationService.sendWelcomeNotification(user3);




        User userArr[] = new User[5];
        userArr[0] = user;
        userArr[1] = sahin;
        userArr[2] = user1;
        userArr[3] = user2;
        userArr[4] = user3;
        for(User u: userArr){
            System.out.println(u.getUsername()+ " : " + u.getRole());
        }


        /*
            User s1 = new Student();
            Student s2 = new User(); ---> Wrong; It gives me error in the compile time.


            Animal -> Make this animal "Bark" --> you can't do this, Because only dogs can bark;
            Animal -> Make it walk --> All animal's can walk


        *
        */
    }
}
