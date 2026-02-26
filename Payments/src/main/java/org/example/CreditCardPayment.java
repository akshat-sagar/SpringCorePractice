package org.example;

public class CreditCardPayment implements PaymentService{
    public void pay(double amount){
        System.out.println("Payment of amount " + amount + "paid using Credit Card");
    }
}
