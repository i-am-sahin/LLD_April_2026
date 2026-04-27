package lld1_april_2026.encapsulation;

public class BankAccountDemo {
    static void main() {
        BankAccount account = new BankAccount();
//        System.out.println(account.balance);
        account.deposit(-1000); // won't add because amount is in negative.
        account.deposit(1000);

        System.out.println(account.getBalance());

    }
}
