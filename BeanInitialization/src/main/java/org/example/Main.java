package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        //if we run application now in console we can see that 2 beans created
        //by default OrderService, paymentService are singleton and eager initialization

        //changed bean initialization of order service to Lazy using @Lazy
        //we can see only payment bean created in console becoz it is eager and orderservice is not used

        OrderService service=context.getBean(OrderService.class);//here paymentservice is not created since constructor has @Lazy
        //but when paymentService methods are called it gets initialized
        System.out.println("PaymentService not created yet");
        service.placeOrder();
        //now Order service gets initialized


        //paymentService is lazy but gets initialized when orderService bean created
        //becoz it is dependency of OrderService
    }
}
