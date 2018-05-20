package edu.neu.zsy.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.neu.zsy.demo.service.IServiceDemo;

/**
 * Created by zsl on 2017/9/2.
 */
@RestController
public class HelloController {
	
	@com.alibaba.dubbo.config.annotation.Reference
	IServiceDemo serviceDemo;

    @RequestMapping("/hello")
    public String Hello() {
        return serviceDemo.sayHello("aaaa");
    }
}