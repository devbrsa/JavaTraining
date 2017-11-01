package com.pluralsight.getorganized;

import static java.lang.Math.abs;

public class Main {

    static int a = 10, b = 2;

    public static void main(String[] args) {

        if (a > 9 & b < 3)
            System.out.println("args = [" + args + "]");

        int value = abs(-2147483648);
        System.out.println(value);
    }
}
