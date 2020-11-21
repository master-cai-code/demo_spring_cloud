package com.nacosDemo03.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zl-cai
 * @date 2020/11/21  12:38
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    public Integer serverPort;

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！"+serverPort;
    }
}
