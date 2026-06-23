package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//
//        OrderService os= context.getBean(OrderService.class);
//        OrderService os2= context.getBean(OrderService.class);
//        System.out.println(os==os2);
        OrderService orderService=new OrderService();
        //we can also create a object but its not managed by spring

        //singleton pattern say one bean for one class def
        //here singleton scope means one bean per bean def

        //here by default OrderService is Singleton scope so it creates only one bean
        //and reference is injected wherever needed
        //default eager initialization

        //after changing scope to prototype, two beans are created
        //lazy initialization


    }
}
