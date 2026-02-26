package org.example;

public class CheckoutService {

    private  PaymentService paymentService;

    // Constructor Injection
    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        paymentService.pay(amount);
    }
}
