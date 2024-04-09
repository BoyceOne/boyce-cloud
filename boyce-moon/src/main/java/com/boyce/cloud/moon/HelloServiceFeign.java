package com.boyce.cloud.moon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author by zhaozhong
 * @date 2024/3/25 12:48
 */
@FeignClient(value = "boyce-star")
public interface HelloServiceFeign {

    @GetMapping(value = "/demo/getHost")
    String getHost(@RequestParam("name") String name);
}
