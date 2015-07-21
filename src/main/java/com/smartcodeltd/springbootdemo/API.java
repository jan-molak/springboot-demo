package com.smartcodeltd.springbootdemo;

import com.smartcodeltd.springbootdemo.domain.Task;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.smartcodeltd.springbootdemo.domain.Task.aListOf;
import static com.smartcodeltd.springbootdemo.domain.Task.task;

@RestController
@EnableAutoConfiguration
public class API {

    @RequestMapping("/api")
    List<Task> index() {
        return aListOf(
                task(1, "Make a to do list"),
                task(2, "Check off first thing on the list"),
                task(3, "Realise you've already accomplished two things"),
                task(4, "Reward yourself with a nap")
        );
    }
}