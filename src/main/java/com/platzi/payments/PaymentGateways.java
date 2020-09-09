package com.platzi.payments;

public interface PaymentGateways {

    PaymentResponse requestPayment(PaymentRequest request);
}
