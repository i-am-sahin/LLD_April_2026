package lld1_april_2026.interfaces;

public class Student implements Payable, Loggable{
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing a payment of rs. " + amount);
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        return "SUCCESS";
    }

    @Override
    public void logError(String message) {
        System.out.println("Student logError: " + message);
    }

    @Override
    public void logInfo(String message) {
        System.out.println("Student logInfo: " + message);

    }


}
