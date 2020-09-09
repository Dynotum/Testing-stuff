package com.platzi.payments;

public class PaymentProcessor {

    private PaymentGateways paymentGateways;

    public PaymentProcessor(PaymentGateways paymentGateways) {
        this.paymentGateways = paymentGateways;
    }

    public boolean makePayment(double amount) {

        final PaymentResponse response = paymentGateways.requestPayment(new PaymentRequest(amount));

        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        }

        return false;
    }
}
