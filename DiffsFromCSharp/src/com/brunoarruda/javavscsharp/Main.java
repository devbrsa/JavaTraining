package com.brunoarruda.javavscsharp;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        int sum = 0;
        for (int value : values) {
            sum += value;
            System.out.println("value = [" + value + "]");
        }
        System.out.println("sum = [" + sum + "]");
    }
}
