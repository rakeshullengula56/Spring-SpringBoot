package org.example;

import org.example.payments.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService(@Qualifier("upi") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("order placed");
    }
}
