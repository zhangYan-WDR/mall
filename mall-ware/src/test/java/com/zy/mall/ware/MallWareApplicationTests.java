package com.zy.mall.ware;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zy.mall.ware.entity.WareInfoEntity;
import com.zy.mall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallWareApplicationTests {

    @Autowired
    private WareInfoService wareInfoService;

    @Test
    void contextLoads() {

        WareInfoEntity infoEntity = new WareInfoEntity();
        infoEntity.setAddress("广东省深圳市");
        infoEntity.setAreacode("440300");
        infoEntity.setName("深圳仓库");
        infoEntity.setId(1L);
        wareInfoService.save(infoEntity);


        LambdaQueryWrapper<WareInfoEntity> wareInfoEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        wareInfoEntityLambdaQueryWrapper.eq(WareInfoEntity::getId, 1L);
        WareInfoEntity wareInfoEntity = wareInfoService.getOne(wareInfoEntityLambdaQueryWrapper);
        System.out.println(wareInfoEntity);


    }

}
