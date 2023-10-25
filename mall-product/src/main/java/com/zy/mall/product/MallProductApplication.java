package com.zy.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 商品服务
 * 1、整合MyBatis-Plus
 *     1）、导入依赖
 *     2）、配置
 *       1）、配置数据源
 *          1）、导入数据库驱动
 *          2）、在application.yml配置数据源相关信息
 *       2）、配置MyBatis-Plus
 *          1）、使用@MapperScan
 *          2）、告诉MyBatis-Plus，sql映射文件位置
 *          mybatis-plus:
 *          mapper-locations: classpath:mapper/*.xml
 */
@SpringBootApplication
@MapperScan("com.zy.mall.product.dao")
@EnableDiscoveryClient // 开启服务注册发现功能
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
