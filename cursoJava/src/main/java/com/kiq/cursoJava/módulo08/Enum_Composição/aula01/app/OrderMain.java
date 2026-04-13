package com.kiq.cursoJava.módulo08.Enum_Composição.aula01.app;

import com.kiq.cursoJava.módulo08.Enum_Composição.aula01.entities.Order;
import com.kiq.cursoJava.módulo08.Enum_Composição.aula01.enums.OrderStatus;

import java.util.Date;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        System.out.println(os1);
        
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os2);
    }
}
