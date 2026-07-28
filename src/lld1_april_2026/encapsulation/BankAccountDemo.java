package lld1_april_2026.encapsulation;

public class BankAccountDemo {
    static void main() {
        BankAccount acc1 = new BankAccount(
                "Rahul",
                001,
                "Savings",
                50000


        );
        BankAccount acc2 = new BankAccount(
                "Sahin",
                002,
                "Savings",
                30000


        );

        // Test operations
        acc1.checkBalance();
        acc1.deposit(10000);
        acc1.withdraw(5000);
        acc1.transfer(acc2, 15000);

        System.out.println("\n--- After transfer ---");
        acc1.checkBalance();
        acc2.checkBalance();

        // Test edge cases
        System.out.println("\n--- Edge Cases ---");

        acc1.deposit(-500);           // Invalid: negative deposit
        acc1.withdraw(100000);         // Invalid: insufficient balance
        acc1.transfer(acc1, 1000);     // Invalid: self transfer

        acc2.deactivate();
        acc1.transfer(acc2, 1000);     // Invalid: recipient inactive
    }
}
//        System.out.println(account.balance);
//        account.deposit(-1000); // won't add because amount is in negative.
//        account.deposit(1000);
//
//        System.out.println(account.checkBalance());