package com.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * hello服务类
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/12 上午11:05
 */
@FeignClient("hello-service")
public interface HelloService {
    /**
     * 打印hello
     *
     * @return hello
     */
    @RequestMapping("/hello")
    String hello();
}
