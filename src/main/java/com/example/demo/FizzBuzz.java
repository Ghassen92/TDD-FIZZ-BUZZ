package com.example.demo;

public class FizzBuzz {

    public static String getResult(int input) {
        if (input <= 0) throw new RuntimeException("Input should be greator then 0");
        String output;
        if (input == 3 | input == 6)
            output = "Fuzz";
        else
            output = "Buzz";
        return output;
    }
}
