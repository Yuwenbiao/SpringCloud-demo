package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/13 下午3:28
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    @RequestMapping("/from2")
    public String from2() {
        return env.getProperty("from", "undefined");
    }
}
