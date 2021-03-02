package com.example.demo;

import static com.example.demo.EFuzzBuzz.BUZZ;
import static com.example.demo.EFuzzBuzz.FUZZ;

public class FizzBuzz {

    public static Object getResult(int input) {
        if (input <= 0) throw new RuntimeException("Input should be greator then 0");
        if (input % 3 == 0)
            return FUZZ.toString();
        else if (input == 5 || input == 10 || input == 15)
            return BUZZ.toString();
        else return input;
    }
}
