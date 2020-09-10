package com.platzi.javatests.util;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        final StringBuilder sb = new StringBuilder();

        if (number % 3 == 0) {
            sb.append("Fizz");
        }

        if (number % 5 == 0) {
            sb.append("Buzz");
        }

        if (sb.length() == 0) {
            sb.append(number);
        }

        return sb.toString();
    }

}
