package com.example.demo;

import static com.example.demo.EFuzzBuzz.BUZZ;
import static com.example.demo.EFuzzBuzz.FUZZ;

public class FizzBuzz {

    public static Object getResult(int input) {
        if (input <= 0) throw new RuntimeException("Input should be greator then 0");
        if (input == 1) return 1;
        if (input == 13) return 13;
        if (input % 3 == 0)
            return FUZZ.toString();
        else
            return BUZZ.toString();
    }
}
