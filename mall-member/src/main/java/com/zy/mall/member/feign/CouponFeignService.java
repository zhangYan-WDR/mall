package com.zy.mall.member.feign;

import com.zy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping(value = "/coupon/coupon/member/list",method = RequestMethod.GET)
    R memberCoupons();

}
