package com.mini.controller;

import com.alibaba.fastjson.JSON;
import com.mini.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <class说明>： Created by WiuLuS on 2020/01/02.
 *
 * @author WiuLuS
 * @version 1.0.0
 * @date 2020/1/2 16:54
 */
@RestController
@RequestMapping
public class TestController {

    @Autowired
    private TestService service ;

    @GetMapping("/first/{name}/{age}/{sex}")
    public Object testMethod(@PathVariable String name , @PathVariable String age , @PathVariable String sex){
        return "name is : " + name + " , age is : " + age + " , sex is : " + sex ;
    }


    @GetMapping("/index")
    public Object testMethod(){
        return service.selectIds();
    }

}