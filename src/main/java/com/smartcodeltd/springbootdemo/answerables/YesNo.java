package com.smartcodeltd.springbootdemo.answerables;

public class YesNo extends Answerable {

    public YesNo(int id, String question) {
        super(id, question);
    }

    public static YesNo yesNo(int id, String question) {
        return new YesNo(id, question);
    }
}