package com.example.aidevdemo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    /**
     * 根据用户等级和价格计算最终折扣价
     * Level 1: 9折, Level 2: 8折, 其余原价
     */
    public double calculateDiscount(double price, int userLevel) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        if (userLevel == 1) {
            return price * 0.9;
        } else if (userLevel >= 2) {
            return price * 0.8;
        }

        return price;
    }
    public void processOrder(String orderId) {
        if (orderId == null) {
            // 故意违反规范：不使用业务异常，直接抛出 RuntimeException
            throw new RuntimeException("订单号不能为空！");
        }
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("测试没有的情况");
        System.out.println("hello");
        System.out.println("我再测试下");
        System.out.println("处理订单: " + orderId);
    }
}