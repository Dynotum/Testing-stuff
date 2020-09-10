package com.platzi.javatests.util;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @InjectMocks
    final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void divisibleBy3() {
        assertEquals(fizzBuzz.fizzBuzz(3), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(6), "Fizz");
    }

    @Test
    public void divisibleBy5() {
        assertEquals(fizzBuzz.fizzBuzz(5), "Buzz");
        assertEquals(fizzBuzz.fizzBuzz(10), "Buzz");
    }

    @Test
    public void divisibleBy3And5() {
        assertEquals(fizzBuzz.fizzBuzz(15), "FizzBuzz");
        assertEquals(fizzBuzz.fizzBuzz(30), "FizzBuzz");
    }

    @Test
    public void notDivisibleBy3And5() {
        assertEquals(fizzBuzz.fizzBuzz(2), "2");
        assertEquals(fizzBuzz.fizzBuzz(16), "16");
    }
}