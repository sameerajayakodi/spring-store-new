package com.example.springstore;

public class OrderService {
    public void placeOrder() {
        StripePaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
