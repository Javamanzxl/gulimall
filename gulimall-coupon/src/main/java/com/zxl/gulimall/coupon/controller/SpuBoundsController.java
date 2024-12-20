package com.zxl.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.zxl.common.to.SpuBoundTo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zxl.gulimall.coupon.entity.SpuBoundsEntity;
import com.zxl.gulimall.coupon.service.SpuBoundsService;
import com.zxl.common.utils.PageUtils;
import com.zxl.common.utils.R;

import javax.annotation.Resource;


/**
 * 商品spu积分设置
 *
 * @author zxl
 * @email 1050295916@qq.com
 * @date 2024-10-22 10:39:32
 */
@RestController
@RequestMapping("coupon/spubounds")
public class SpuBoundsController {
    @Resource
    private SpuBoundsService spuBoundsService;



    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SpuBoundsEntity spuBounds = spuBoundsService.getById(id);

        return R.ok().put("spuBounds", spuBounds);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody SpuBoundsEntity spuBounds){
        spuBoundsService.save(spuBounds);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuBoundsEntity spuBounds){
		spuBoundsService.updateById(spuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		spuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
