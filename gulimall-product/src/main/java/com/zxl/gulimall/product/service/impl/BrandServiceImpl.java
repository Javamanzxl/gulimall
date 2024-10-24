package com.zxl.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxl.common.utils.PageUtils;
import com.zxl.common.utils.Query;

import com.zxl.gulimall.product.dao.BrandDao;
import com.zxl.gulimall.product.entity.BrandEntity;
import com.zxl.gulimall.product.service.BrandService;

import javax.annotation.Resource;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {
    @Resource
    private BrandDao brandDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void updateStatus(Long brandId, Integer showStatus) {
        brandDao.updateStatus(brandId,showStatus);
    }
}