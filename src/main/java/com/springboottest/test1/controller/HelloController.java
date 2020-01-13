package com.springboottest.test1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author lxl
 * @Date 2020/1/11
 * @Version V1.0
 **/
@RestController
public class HelloController {

    /**
     * @MethodName: HelloWorld
     * @Description: TODO
     * @Param: []
     * @Return: java.lang.String
     * @Author: lxl
     * @Date: 下午4:00
    **/
    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "HelloWorld";
    }
}
