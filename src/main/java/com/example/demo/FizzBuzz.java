package com.example.demo;

public class FizzBuzz {

    public static String getResult(int input) {
        if (input <= 0) throw new RuntimeException("Input should be greator then 0");
        String output = input == 3 ? "Fuzz" : "Buzz";
        return output;
    }
}
