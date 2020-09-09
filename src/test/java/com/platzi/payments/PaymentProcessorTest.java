package com.platzi.payments;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class PaymentProcessorTest {

    @Mock
    final PaymentGateways paymentGateways = Mockito.mock(PaymentGateways.class);

    @InjectMocks
    final PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateways);

    @Test
    public void paymentSuccess() {

        when(paymentGateways.requestPayment(Mockito.any()))     // any(): Simulate with mockito classes that can not be tested directly (PaymentRequest).
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void paymentUnsuccessful() {

        when(paymentGateways.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}