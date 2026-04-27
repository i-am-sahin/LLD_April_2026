package lld1_april_2026.encapsulation;

public class BankAccount {
    private double balance; // Anyone Outside this class,they did not access this value,Because It's private.

    public void  deposit(double amount){ // Controlled access
        // Validate the value of amount
        if(amount > 0){
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}