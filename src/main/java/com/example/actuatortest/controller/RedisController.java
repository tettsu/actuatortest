package com.example.actuatortest.controller;

import com.example.actuatortest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value="/add",method= RequestMethod.GET)
    public String add(String key,String value) {
        redisService.set(key, value);

        return "add successfully";
    }

    @GetMapping(value="/delete")
    public String delete(String key) {

        redisService.del(key);
        return "delete successfully";
    }

    @GetMapping(value="/get")
    public String get(String key) {
        return redisService.get(key)==null ? "data don't exist!" : redisService.get(key).toString();
    }

}