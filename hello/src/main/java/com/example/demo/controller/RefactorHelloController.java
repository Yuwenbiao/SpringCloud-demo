package com.example.demo.controller;

import com.dto.User;
import com.service.RefactorHelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/13 下午1:17
 */
@RestController
public class RefactorHelloController implements RefactorHelloService {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello" + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello" + user.getName() + "," + user.getAge();
    }
}
