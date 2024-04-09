package com.boyce.cloud.moon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

/**
 * @author by zhaozhong
 * @date 2024/3/25 13:23
 */
@Configuration
public class ProjectNameConfig implements EnvironmentAware {

    @Value("${spring.application.name}")
    private  String applicationName;

    @Override
    public void setEnvironment(Environment environment) {
        if(StringUtils.isEmpty(System.getProperty("project.name"))){
            System.setProperty("project.name",applicationName);
        }
    }
}
