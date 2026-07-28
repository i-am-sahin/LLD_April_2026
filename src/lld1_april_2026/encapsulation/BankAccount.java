package lld1_april_2026.encapsulation;

public class BankAccount {
    private double balance; // Anyone Outside this class,they did not access this value,Because It's private.
    private int accountNumber;
    private String name;
    private String accountType;
    private boolean isActive;

    public BankAccount(String name,int accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.isActive = true;
    }



    public void  deposit(double amount){ // Controlled access
        // Validate the value of amount
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(isActive && amount > 0 &&  balance >= amount){
            balance -= amount;
            System.out.println(this.name + " withdrew " + amount);
        }
    }

    public void deactivate(){
        isActive = false;
        System.out.println(this.name + " deactivated");
    }
    public void transfer(BankAccount destination, double amount){
        if(this == destination){
            System.out.println("Transfer failed");
        }
        else if (amount > 0 && balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
        }
    }

    public double checkBalance(){
        return balance;
    }
}