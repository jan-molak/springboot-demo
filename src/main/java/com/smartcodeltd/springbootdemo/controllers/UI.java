package com.smartcodeltd.springbootdemo.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.smartcodeltd.springbootdemo.answerables.Choice.choice;
import static com.smartcodeltd.springbootdemo.answerables.Sugar.aListOf;
import static com.smartcodeltd.springbootdemo.domain.Task.task;
import static com.smartcodeltd.springbootdemo.answerables.SingleLineInput.singleLineEntry;
import static com.smartcodeltd.springbootdemo.answerables.YesNo.yesNo;

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

    @RequestMapping("/form")
    String questions(Model model) {

        model.addAttribute("questions", aListOf(
            yesNo           (1, "Would you like to subscribe to our newsletter?"),
            singleLineEntry (2, "What's your name?"),
            choice          (3, "How many emails per week?", aListOf(
                                    "No more than 1",
                                    "Up to 5",
                                    "Up to 10"
                            ))
        ));

        return "form";
    }
}