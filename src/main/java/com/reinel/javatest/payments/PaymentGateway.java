package com.reinel.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
