package com.caimy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zl-cai
 * @date 2020/11/21  12:33
 */
@RestController
public class HelloController {

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer")
    public String test1() {
        return restTemplate.getForObject("http://nacos-provide/helloNacos",String.class);
    }
}
