package com.zy.mall.coupon.dao;

import com.zy.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-25 21:00:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
