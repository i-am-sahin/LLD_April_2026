package lld1_april_2026.phonepe;

public class Main {
    static void main() {
        BankingPatnerAPI yesBank = new YesBankPartner();
        BankingPatnerAPI icicBank = new ICICIBankPartner();

        PhonePePaymentService phonePe = new PhonePePaymentService(icicBank);


        phonePe.processPayment("1122","2233",3344);


    }
}
