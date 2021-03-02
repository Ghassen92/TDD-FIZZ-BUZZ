package com.example.demo;

import static com.example.demo.EFuzzBuzz.BUZZ;
import static com.example.demo.EFuzzBuzz.FUZZ;

public class FizzBuzz {

    public static String getResult(int input) {
        if (input <= 0) throw new RuntimeException("Input should be greator then 0");
        if (input == 3 | input == 6)
            return FUZZ.toString();
        else
            return BUZZ.toString();
    }
}
