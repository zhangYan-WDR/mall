package com.zy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.common.utils.PageUtils;
import com.zy.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-25 21:00:25
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

