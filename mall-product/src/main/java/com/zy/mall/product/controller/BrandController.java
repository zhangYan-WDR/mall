package com.zy.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.zy.common.validator.group.AddGroup;
import com.zy.common.validator.group.UpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zy.mall.product.entity.BrandEntity;
import com.zy.mall.product.service.BrandService;
import com.zy.common.utils.PageUtils;
import com.zy.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author zhangyan
 * @email 16602132862@163.com
 * @date 2023-10-09 23:01:46
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    /**
     * Validated和Valid注解的区别是Validated可以进行分组校验
     * 并且分组校验指定了之后，只有在指定的分组才会失效
     * 如果controller没有指定分组则实体类里面指定了分组的字段校验都不生效了
     */
    public R save(@Validated(value = {UpdateGroup.class}) @RequestBody BrandEntity brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
