package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService os= context.getBean(OrderService.class);
        OrderService os2= context.getBean(OrderService.class);
        System.out.println(os==os2);

        //here by default OrderService is Singleton scope so it creates only one bean
        //and reference is injected wherever needed


    }
}
