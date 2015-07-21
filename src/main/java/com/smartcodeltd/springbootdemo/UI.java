package com.smartcodeltd.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class UI {

    public UI() {
        super();
    }

    @RequestMapping("/")
    String index(Model model) {

        model.addAttribute("todos", aListOf(
            "Make a to do list",
            "Check off first thing on the list",
            "Realise you've already accomplished two things",
            "Reward yourself with a nap"
        ));

        return "index";
    }

    private List<String> aListOf(String... items) {
        return Arrays.asList(items);
    }
}