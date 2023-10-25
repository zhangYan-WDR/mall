package com.zy.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.common.utils.PageUtils;
import com.zy.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-25 21:02:45
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

