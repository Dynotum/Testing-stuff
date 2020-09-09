package com.platzi.javatests.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    final StringUtil stringUtil = new StringUtil();

    @Test
    public void testRepeat() {
        final String result = stringUtil.repeat("hello", 3);
        assertEquals("hellohellohello", result);
    }

    @Test
    public void testZeroTimes() {
        final String result = stringUtil.repeat("hello", 0);
        assertEquals("hello", result);
    }

    @Test
    public void negativeTimes() {
        assertThrows(IllegalArgumentException.class, () -> stringUtil.repeat("hello", -2), "hello");
    }

}