package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService=context.getBean(OrderService.class);
        orderService.placeOrder();

        /*Circular dependency is resolved using @Autowired but springBoot 2.5++ doesn't allow it*/
        //in SB by default spring.main.allow-circular-reference=false;
        // but do not use it, it is a bad coding style
    }
}
