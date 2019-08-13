package com.service;

import com.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * Hello
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/13 下午1:12
 */
@RequestMapping("/refactor")
public interface RefactorHelloService {
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
