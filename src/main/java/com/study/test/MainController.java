package com.study.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // 기본 경로를 '/api'로 설정
public class MainController {

    // GET 요청을 처리
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String greet() {
        return "Hello, World!";
    }

    // GET 요청을 처리
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return "User: Nayoung Lee";
    }

    // POST 요청을 처리
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestBody String body) {
        return "Created with body: " + body;
    }
}