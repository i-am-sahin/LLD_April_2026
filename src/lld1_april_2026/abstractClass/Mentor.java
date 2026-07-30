package lld1_april_2026.abstractClass;

public class Mentor extends User {
    private boolean availability;
    private double rating;

    @Override
    public String getRole() {
        return "Mentor";
    }

    @Override
    public void anotherDailyTask() {
        System.out.println("Conduct Mentoring seasons with mentees");
    }

    public Mentor(String id, String username, String email) {
        super(id, username, email);
    }
}
