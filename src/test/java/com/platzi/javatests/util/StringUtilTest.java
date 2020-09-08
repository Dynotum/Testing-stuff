package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    final StringUtil stringUtil = new StringUtil();

    @Test
    public void testRepeat() {
        final String result = stringUtil.repeat("hello", 3);
        Assert.assertEquals("hellohellohello", result);
    }

    @Test
    public void testZeroTimes() {
        final String result = stringUtil.repeat("hello", 0);
        Assert.assertEquals("hello", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeTimes() {
        final String result = stringUtil.repeat("hello", -2);
        Assert.assertEquals("hello", result);
    }


}