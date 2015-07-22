package com.smartcodeltd.springbootdemo.answerables;

import java.util.Arrays;
import java.util.List;

public class Sugar {
    public static <T> List<T> aListOf(T... items) {
        return Arrays.asList(items);
    }
}