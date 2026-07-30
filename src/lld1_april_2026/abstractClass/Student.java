package lld1_april_2026.abstractClass;

public class Student extends User { //Student is a extended part of User
    //Additional Attributes for the specific Student
    private String batchId;
    private int assignmentCompleted;
    private double psp;

    public Student(String id, String username, String email,String batchId) {
        super(id, username,email); // Constructor of the parent

        this.batchId = batchId;
        this.assignmentCompleted = 0;
        this.psp = 0;
    }

    //Additional Behaviors for the specific Student
    public void submitAssignment(){
        assignmentCompleted++;
        System.out.println("Total assignment submitted: " + assignmentCompleted);
    }

    public String getBatchId() {
        return batchId;
    }

    public double getPsp() {
        return psp;
    }

    //This is a overwritter Method.
    public String getRole(){ // getRole()
        return "Student";
    }

    @Override
    public void anotherDailyTask() {
        System.out.println("Attending lectures & Completing Assignments");
    }
}



