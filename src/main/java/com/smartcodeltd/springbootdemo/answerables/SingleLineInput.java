package com.smartcodeltd.springbootdemo.answerables;

public class SingleLineInput extends Answerable {

    public SingleLineInput(int id, String question) {
        super(id, question);
    }

    public static SingleLineInput singleLineEntry(int id, String question) {
        return new SingleLineInput(id, question);
    }
}