package com.example.demo;

public enum EFuzzBuzz {
    FUZZ("Fuzz"), BUZZ("Buzz");

    private String label;

    EFuzzBuzz(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
