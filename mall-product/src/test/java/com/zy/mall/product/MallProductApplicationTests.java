package com.zy.mall.product;


import com.zy.mall.product.service.BrandService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;
//	@Autowired
//	OSSClient ossClient;
//	@Test
//	void contextLoads() {
//
////		BrandEntity brandEntity = new BrandEntity();
////		brandEntity.setBrandId(1L);
////		brandEntity.setName("华为");
////		brandService.updateById(brandEntity);
//////		brandService.save(brandEntity);
////		System.out.println("保存成功");
//
//		LambdaQueryWrapper<BrandEntity> brandEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();
//		brandEntityLambdaQueryWrapper.eq(BrandEntity::getBrandId, 1L);
//		List<BrandEntity> list = brandService.list(brandEntityLambdaQueryWrapper);
//		System.out.println(list);
//
//	}



//	@Test
//	public void ossUpload() throws FileNotFoundException {
//		InputStream inputStream = new FileInputStream("/Users/zhangyan/Desktop/1.jpg");
//		ossClient.putObject("zy-mall-shopping","1.jpg",inputStream);
//	}

}
