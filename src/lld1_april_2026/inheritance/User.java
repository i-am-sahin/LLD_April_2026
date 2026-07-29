package lld1_april_2026.inheritance;

public class User {
    //Common attributers for all Users.
    private String id;
    private String username;
    private String email;
    private  String password;

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
