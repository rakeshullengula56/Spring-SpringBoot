package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean   //this is separate bean def with scope singleton
    public OrderService getOrderService(){
        return new OrderService();
    }

    @Bean //this is separate bean def with scope singleton
    public OrderService getOrderService2(){
        return new OrderService();
    }
    //but it is bad coding style
}
