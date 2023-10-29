package com.zy.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.common.utils.PageUtils;
import com.zy.common.utils.Query;

import com.zy.mall.product.dao.CategoryDao;
import com.zy.mall.product.entity.CategoryEntity;
import com.zy.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 对所有的分类进行树状处理
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1. 查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 2.使用递归将所有分类进行归类
        List<CategoryEntity> result = categoryEntities.stream().filter(
                //先查出一级分类，在一级分类的基础上对全部分类进行递归处理
                category -> category.getParentCid() == 0
        ).map((rootCategory) -> {
            rootCategory.setChildren(getChildrens(rootCategory, categoryEntities));
            return rootCategory;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return result;
    }

    /**
     * 递归在所有分类中获取当前分类的子分类
     * @param rootCategory 当前父级分类
     * @param allEntities 所有分类
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity rootCategory, List<CategoryEntity> allEntities) {
        return allEntities.stream().filter(
            // 1.在所有的分类中查找当前层级的子分类
            category->category.getParentCid().equals(rootCategory.getCatId())
        ).map(category->{
            // 2.递归查找子分类的子分类（子分类返回之后再进一步向上返回）
            category.setChildren(getChildrens(category, allEntities));
            return category;
        }
        ).sorted((menu1, menu2)->{
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }
        ).collect(Collectors.toList());
    }
}