package lld1_april_2026.phonepe;

public interface BankingPatnerAPI {


    boolean connect();
    boolean authenticate();
    boolean transferMoney(String fromAccount, String toAccount, double amount);
    double getBalance(String accountId);
}
