package lld1_april_2026.polymorphism;



public class Instructor extends User {
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

}