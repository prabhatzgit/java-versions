package jdk8.fiandlambda;

public class Paytm implements UPIPayment {
    @Override
    public String doUpiPayment(String source, String destination) {
        String dateFormat = UPIPayment.datePatterns("YYYY-mm-dd");
        return dateFormat;
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
