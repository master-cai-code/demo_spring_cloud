package com.caimy.controller;

import com.caimy.service.OpenfeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zl-cai
 * @date 2020/11/21  12:33
 */
@RestController
public class HelloController {

    //@Resource
    //private RestTemplate restTemplate;

    @Resource
    private OpenfeignService openfeignService;


    @GetMapping("/consumer")
    public String test1(@RequestParam(value = "param1", required = false) String param1) {
        //return restTemplate.getForObject("http://nacos-provide/helloNacos"+"/?param1="+param1,String.class);
        return openfeignService.helloNacos(param1);
    }
}
