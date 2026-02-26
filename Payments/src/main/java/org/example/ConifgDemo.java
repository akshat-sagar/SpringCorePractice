package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConifgDemo {

    // Choose which implementation you want
    @Bean
    public PaymentService paymentService() {
        return new CreditCardPayment();
        // return new UPIPayment();  // switch here if needed
    }

    @Bean
    public CheckoutService checkoutService() {
        return new CheckoutService(paymentService());
    }


}
