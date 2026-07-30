package lld1_april_2026.abstractClass;

public abstract class User {
    //Common attributers for all Users.
    private String id;
    private String username;
    private String email;
    private  String password;

    // Abstract Method
    // If the method is abstract, Child classes must Implement this. ..... Otherwise the child class must also be abstract.
    public abstract String getRole();

    // Another abstract method
    public abstract void anotherDailyTask();

    public User(){

    }

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;

    }
    public boolean login(String enteredPassword){
        return  this.password.equals(enteredPassword);
    }
    public void logout(){
        System.out.println(username + " logged out Successfully");
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
