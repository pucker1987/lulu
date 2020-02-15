package com.lulu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESC
 *
 * @author Zack Liu
 * @date 2020/2/15 11:17 下午
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}
