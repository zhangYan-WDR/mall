package com.zy.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.common.utils.PageUtils;
import com.zy.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-25 21:04:27
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

