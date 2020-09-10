package com.platzi.javatests.util;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class DataUtilShould {

    @InjectMocks
    final DateUtil dateUtil = new DateUtil();

    @Test
    public void divisibleBy400() {
        assertTrue(dateUtil.isLeapYear(1600));
        assertTrue(dateUtil.isLeapYear(2000));
        assertTrue(dateUtil.isLeapYear(2400));
    }

    @Test
    public void divisibleBy100ButNotBy400AreNotLeapYear() {
        assertFalse(dateUtil.isLeapYear(1700));
        assertFalse(dateUtil.isLeapYear(1800));
        assertFalse(dateUtil.isLeapYear(1900));
    }

    @Test
    public void divisibleBy4ButNotBy100AreLeapYear() {
        assertTrue(dateUtil.isLeapYear(1996));
        assertTrue(dateUtil.isLeapYear(2004));
        assertTrue(dateUtil.isLeapYear(2008));
    }

    @Test
    public void notDivisibleBy4AreNotLeapYear() {
        assertFalse(dateUtil.isLeapYear(2017));
        assertFalse(dateUtil.isLeapYear(2018));
        assertFalse(dateUtil.isLeapYear(2019));
    }
}