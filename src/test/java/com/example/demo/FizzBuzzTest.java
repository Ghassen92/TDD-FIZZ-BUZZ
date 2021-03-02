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

        String output= (String) FizzBuzz.getResult(input);

        Assertions.assertEquals("Fuzz",output);
    }

    @Test
    void should_return_buzz_for_5(){
        int input = 5;

        String output= (String) FizzBuzz.getResult(input);

        Assertions.assertEquals("Buzz",output);
    }

    @Test
    void should_return_fuzz_for_6(){
        int input = 6;

        String output= (String) FizzBuzz.getResult(input);

        Assertions.assertEquals("Fuzz",output);
    }

    @Test
    void should_return_fuzz_for_9(){
        int input = 9;

        String output= (String) FizzBuzz.getResult(input);

        Assertions.assertEquals("Fuzz",output);
    }

    @Test
    void should_return_same_for_1(){
        int input = 1;

        int output= (int) FizzBuzz.getResult(input);

        Assertions.assertEquals(1,output);
    }

    @Test
    void should_return_same_for_13(){
        int input = 13;

        int output= (int) FizzBuzz.getResult(input);

        Assertions.assertEquals(13,output);
    }
}
