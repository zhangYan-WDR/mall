package com.zy.mall.order;


import com.zy.mall.order.entity.OrderReturnReasonEntity;
import com.zy.mall.order.service.OrderReturnReasonService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallMallOrderApplicationTests {

    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    @Test
    void contextLoads() {

        OrderReturnReasonEntity orderReturnReason = new OrderReturnReasonEntity();
//        orderReturnReason.setId(1L);
//        orderReturnReason.setName("测试");
//        orderReturnReason.setSort(1);
//        orderReturnReason.setStatus(1);
//        orderReturnReason.setCreateTime(new Date());
//        orderReturnReason.save(omsOrderReturnReason);


        orderReturnReasonService.list().forEach(System.out::println);

    }

}
