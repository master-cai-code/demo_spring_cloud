package com.nacosDemo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zl-cai
 * @date 2020/11/21  0:34
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvideApplication03 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvideApplication03.class, args);
    }


}
