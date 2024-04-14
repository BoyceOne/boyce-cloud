package com.boyce.cloud.moon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author by zhaozhong
 * @date 2024/4/9 12:05
 */
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "person")
public class PersonConfig {

    private Integer age;

    private Integer height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
