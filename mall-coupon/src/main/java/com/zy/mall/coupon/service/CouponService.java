package com.zy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.common.utils.PageUtils;
import com.zy.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-25 21:00:25
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

