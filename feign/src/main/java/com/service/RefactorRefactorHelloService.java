package com.service;

import org.springframework.cloud.netflix.feign.FeignClient;
/**
 * Hello
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/13 下午2:13
 */
@FeignClient(value = "HELLO-SERVICE")
public interface RefactorRefactorHelloService extends RefactorHelloService {

}
