package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by HZL
 * @date 2019/12/10 10:16
 * @description
 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello jwt！";
    }

    @GetMapping("/admin")
    public String admin(){
        return "hello admin！";
    }
}
