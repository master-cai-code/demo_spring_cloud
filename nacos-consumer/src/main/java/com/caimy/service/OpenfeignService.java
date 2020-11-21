package com.caimy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zl-cai
 * @date 2020/11/21  23:33
 * 远程调用的接口interface，和服务提供者的controller一样，只不过方法没有方法体
 */
@FeignClient(name = "nacos-provide")
public interface OpenfeignService {
    @GetMapping("/helloNacos")
    public String helloNacos(@RequestParam(value = "param1", required = false) String param);
}
