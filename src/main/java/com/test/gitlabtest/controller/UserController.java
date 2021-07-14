package com.test.gitlabtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author pq
 * @Date 2021/7/14 14:23
 * @Description TODO
 */
@RestController
@RequestMapping("test")
public class UserController {
    @RequestMapping("query")
    public String queryUser(String userName){
        return userName;
    }
}
