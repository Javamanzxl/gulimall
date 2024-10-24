package com.zxl.gulimall.product.feign;

import com.zxl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("gulimall-ware")
public interface WareFeignService {
    @RequestMapping("ware/wareinfo/list")
    R list(@RequestParam Map<String, Object> params);
}
