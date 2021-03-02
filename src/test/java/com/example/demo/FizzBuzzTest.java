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
                () -> FizzBuzz.getResult(input));
    }

    @Test
    void should_throw_exception_for_minus4() {
        int input = -4;

        Assertions.assertThrows(RuntimeException.class,
                () -> FizzBuzz.getResult(input));
    }

    @Test
    void should_return_fuzz_for_3(){
        int input = 3;

        String output=FizzBuzz.getResult(3);

        Assertions.assertEquals("Fuzz",output);
    }

    @Test
    void should_return_buzz_for_5(){
        int input = 5;

        String output=FizzBuzz.getResult(5);

        Assertions.assertEquals("Buzz",output);
    }

    @Test
    void should_return_fuzz_for_6(){
        int input = 6;

        String output=FizzBuzz.getResult(6);

        Assertions.assertEquals("Fuzz",output);
    }

    @Test
    void should_return_fuzz_for_9(){
        int input = 9;

        String output=FizzBuzz.getResult(6);

        Assertions.assertEquals("Fuzz",output);
    }
}
