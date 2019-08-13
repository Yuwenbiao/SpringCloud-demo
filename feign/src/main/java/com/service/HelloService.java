package com.service;

import com.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
