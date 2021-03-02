package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_throw_exception_for_minus1() {
        int input = -1;

        Assertions.assertThrows(RuntimeException.class,
                () -> FizzBuzz.getResult(input));
    }

    @Test
    void should_not_throw_exception_for_1() {
        int input = 1;

        Assertions.assertDoesNotThrow(() -> FizzBuzz.getResult(input));
    }

    @Test
    void should_throw_exception_for_0() {
        int input = 0;

        Assertions.assertThrows(RuntimeException.class,
                () -> FizzBuzz.getResult(input));    }

}
