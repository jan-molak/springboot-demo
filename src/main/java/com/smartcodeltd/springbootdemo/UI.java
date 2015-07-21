package com.smartcodeltd.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.smartcodeltd.springbootdemo.domain.Task.aListOf;
import static com.smartcodeltd.springbootdemo.domain.Task.task;

@Controller
@EnableAutoConfiguration
public class UI {

    public UI() {
        super();
    }

    @RequestMapping("/")
    String index(Model model) {

        model.addAttribute("tasks", aListOf(
            task(1, "Make a to do list"),
            task(2, "Check off first thing on the list"),
            task(3, "Realise you've already accomplished two things"),
            task(4, "Reward yourself with a nap")
        ));

        return "index";
    }
}