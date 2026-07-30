package lld1_april_2026.phonepe;

public class ICICIBankPartner implements BankingPatnerAPI {
    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean authenticate() {
        return false;
    }

    @Override
    public boolean transferMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }

    @Override
    public double getBalance(String accountId) {
        return 0;
    }
}
