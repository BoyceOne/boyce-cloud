package com.boyce.cloud.moon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author by zhaozhong
 * @date 2024/3/25 12:55
 */
@RefreshScope
@RestController
public class TestController {

    @Resource
    private HelloServiceFeign helloServiceFeign;

    @Value("${person.age}")
    private Integer age;

    @Resource
    private PersonConfig personConfig;

    @GetMapping("/test")
    public String test() {

        System.out.println(personConfig.getHeight());

        return helloServiceFeign.getHost("xxx") + age;
    }
}
