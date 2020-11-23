package com.nacosDemo03.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zl-cai
 * @date 2020/11/21  12:38
 */
@RestController
@RefreshScope      //加上该注解的类可以自动获取更改后的配置值，不用重启
public class HelloController {
    @Value("${server.port}")
    public Integer serverPort;

    @Value("${nacos.config}")
    public String myName;

    @GetMapping("/getname")
    public String getName() {
        return myName;
    }

    @GetMapping("/helloNacos")
    public String helloNacos() {
        return "你好，nacos！" + serverPort;
    }
}
