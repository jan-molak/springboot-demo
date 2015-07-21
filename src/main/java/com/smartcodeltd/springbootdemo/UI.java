package com.smartcodeltd.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class UI {

    public UI() {
        super();
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }
}