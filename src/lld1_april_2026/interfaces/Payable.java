package lld1_april_2026.interfaces;

public interface Payable {

    void makePayment(double amount);

    String getPaymentStatus(String transactionId);
    void logInfo(String message);
}
