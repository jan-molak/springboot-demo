package com.smartcodeltd.springbootdemo.domain;

import java.util.Arrays;
import java.util.List;

public class Task {
    private final int id;
    private final String value;

    public Task(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static Task task(int id, String value) {
        return new Task(id, value);
    }
}
