package com.boyce.cloud.moon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author by zhaozhong
 * @date 2024/3/25 12:55
 */
@RestController
public class TestController {

    @Resource
    private HelloServiceFeign helloServiceFeign;

    @GetMapping("/test")
    public String test() {

        return helloServiceFeign.getHost("xxx");
    }
}
