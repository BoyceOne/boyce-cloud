package com.boyce.cloud.star;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by zhaozhong
 * @date 2024/3/25 12:51
 */
@RestController
public class HelloServiceController {

    @GetMapping(value = "/demo/getHost")
    public String getHost(@RequestParam("name") String name) {
        System.out.println("访问到了");
        return "11.111.1.1";
    }

}
