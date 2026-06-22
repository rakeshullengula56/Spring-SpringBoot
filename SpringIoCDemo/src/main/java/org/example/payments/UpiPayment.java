package org.example.payments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upiPay")
public class UpiPayment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Payment done with UPI");
    }
}
