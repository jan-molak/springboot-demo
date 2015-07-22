package com.smartcodeltd.springbootdemo.answerables;

import java.util.List;

public class Choice extends Answerable {

    private final List<String> choices;

    public Choice(int id, String question, List<String> options) {
        super(id, question);

        this.choices = options;
    }

    public List<String> getOptions() {
        return choices;
    }

    public static Choice choice(int id, String question, List<String> options) {
        return new Choice(id, question, options);
    }
}
