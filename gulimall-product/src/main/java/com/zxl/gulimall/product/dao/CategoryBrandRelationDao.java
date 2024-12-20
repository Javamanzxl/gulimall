package com.zxl.gulimall.product.dao;

import com.zxl.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author zxl
 * @email 1050295916@qq.com
 * @date 2024-10-22 10:38:33
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);
}
