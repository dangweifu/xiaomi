package com.mini.controller;

import com.alibaba.fastjson.JSON;
import com.mini.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

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
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        return "name is : " + name + " , age is : " + age + " , sex is : " + sex ;
    }


    @GetMapping("/index")
    public Object testMethod_1(){
        return service.selectIds();
    }

    @GetMapping("/index/test")
    public Object testMethod_2(){
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        return service.selectIds();
    }

}
