package com.zy.mall.order.dao;

import com.zy.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-23 22:06:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
