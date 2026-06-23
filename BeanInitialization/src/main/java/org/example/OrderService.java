package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //lazy init
public class OrderService {
    private PaymentService paymentService;
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService=paymentService;
        System.out.println("orderService created");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
