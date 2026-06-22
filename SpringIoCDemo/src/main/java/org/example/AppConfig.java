package org.example;


import org.example.payments.CardPayment;
import org.example.payments.PaymentService;
import org.example.payments.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    //@Primary
    @Qualifier("card")
    public PaymentService getCardPaymentService(){
        return new CardPayment();
    }

    @Bean
    @Qualifier("upi")
    public PaymentService getUpiPaymentService(){
        return new UpiPayment();
    }

//    @Bean
//    public OrderService getOrderService(){
//        return new OrderService(getCardPaymentService());
//    }
//    @Bean
//    public OrderService getOrderService(){
//        return new OrderService(getUpiPaymentService());
//    }

    //constructor injection
//    @Bean
//    public OrderService getOrderService(@Qualifier("card") PaymentService paymentService){
//        return new OrderService(paymentService);
//    }


    //setter injection
//    @Bean
//    public OrderService getOrderService(){
//       OrderService orderService= new OrderService();
//       orderService.setPaymentService(getUpiPaymentService());
//       return orderService;
//    }

    @Bean
    public OrderService getOrderService(@Qualifier("card") PaymentService paymentService){
        return new OrderService(paymentService);
    }


}
