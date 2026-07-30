package lld1_april_2026.abstractClass;


public  abstract class Instructor extends User {
    private String expertise;
    private double rating;
    private int coursesCreated;
    public Instructor(String id, String username, String email, String expertise){

        // Constructor Chaining
        super(id, username, email);
        this.expertise = expertise;
        this.rating = 1.0;
        this.coursesCreated = 0;
    }

    @Override
    public String getRole() {
        return "Instructor";
    }

//    @Override
//    public void anotherDailyTask() {
//        System.out.println("Prepareing & Delivering lectures on : " + expertise);
//    }
}