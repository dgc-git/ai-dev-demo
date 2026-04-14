package com.example.aidevdemo;

import com.example.aidevdemo.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiDevDemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void testCalculateDiscount_FakeTest() {
        // 只有调用，没有任何 assertThat 断言！
        // 这种代码能骗过 JaCoCo 增加覆盖率，但毫无用处
        OrderService orderService = new OrderService();
        orderService.calculateDiscount(100.0, 2);
    }
}
