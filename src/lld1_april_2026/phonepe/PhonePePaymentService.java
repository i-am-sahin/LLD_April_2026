package lld1_april_2026.phonepe;

public class PhonePePaymentService {

    // There is a problem in this code; If yesBank is not working then phonePe is also not working.

//    YesBankAPI yesBankAPI = new YesBankAPI();
//
//    public boolean processUPIPayment(String upiId, double amount) {
//        yesBankAPI.connect();
//        yesBankAPI.authenticate();
//        boolean success = yesBankAPI.transferMoney(upiId, amount);
//        return success;
//    }



    private BankingPatnerAPI bankingPatnerAPI;

    public PhonePePaymentService(BankingPatnerAPI bankingPatnerAPI) {
        this.bankingPatnerAPI = bankingPatnerAPI;
    }

    public boolean processPayment(String from, String to, double amount) {
        bankingPatnerAPI.connect();
        bankingPatnerAPI.authenticate();
        return bankingPatnerAPI.transferMoney(from,to,amount);

    }
    public double checkBalance(String accountNumber) {
        return bankingPatnerAPI.getBalance(accountNumber);
    }


}
