package com.smartcodeltd.springbootdemo.answerables;

public abstract class Answerable {
    private final int id;
    protected final String question;

    public Answerable(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
