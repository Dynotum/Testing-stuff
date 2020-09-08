package com.platzi.javatests.util;

import java.util.function.IntFunction;

public class StringUtil {

    public static void main(String[] args) {

    }

    public String repeat(String str, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("Sorry bro. Only positive numbers allowed.");
        }
        if (times == 0) {
            return str;
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
