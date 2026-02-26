package org.example;

public class UPIPayment implements PaymentService{
    public void pay(double amount){
        System.out.println("Payment of amount " + amount + " paid using UPI Payment");
    }
}
