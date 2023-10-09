package com.zy.mall.product.dao;

import com.zy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-09 22:27:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
