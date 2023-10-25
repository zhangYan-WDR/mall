package com.zy.mall.coupon;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zy.mall.coupon.entity.CouponSpuRelationEntity;
import com.zy.mall.coupon.service.CouponSpuRelationService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallCouponApplicationTests {

    @Autowired
    private CouponSpuRelationService couponSpuRelationService;

    @Test
    void contextLoads() {

        CouponSpuRelationEntity couponSpuRelationEntity = new CouponSpuRelationEntity();
        couponSpuRelationEntity.setCouponId(1L);
        couponSpuRelationEntity.setSpuId(1L);
        couponSpuRelationService.save(couponSpuRelationEntity);

        LambdaQueryWrapper<CouponSpuRelationEntity> couponSpuRelationEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
        couponSpuRelationEntityLambdaQueryWrapper.eq(CouponSpuRelationEntity::getId, 1L);
        CouponSpuRelationEntity one = couponSpuRelationService.getOne(couponSpuRelationEntityLambdaQueryWrapper);
        System.out.println(one);


    }

}
