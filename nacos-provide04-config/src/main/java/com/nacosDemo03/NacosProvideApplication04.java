package com.nacosDemo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author zl-cai
 * @date 2020/11/21  0:34
 */

@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class NacosProvideApplication04 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvideApplication04.class, args);
    }


}
