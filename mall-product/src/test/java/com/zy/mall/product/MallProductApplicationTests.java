package com.zy.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zy.mall.product.entity.BrandEntity;
import com.zy.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {

//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(1L);
//		brandEntity.setName("华为");
//		brandService.updateById(brandEntity);
////		brandService.save(brandEntity);
//		System.out.println("保存成功");

		LambdaQueryWrapper<BrandEntity> brandEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
		brandEntityLambdaQueryWrapper.eq(BrandEntity::getBrandId, 1L);
		List<BrandEntity> list = brandService.list(brandEntityLambdaQueryWrapper);
		System.out.println(list);

	}

}
