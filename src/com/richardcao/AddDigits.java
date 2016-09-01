package com.richardcao;

/**
 * Created by richardcao on 16/6/16.
 */
public class AddDigits {

    public static void main(String[] args) {
        System.out.printf("" + addDigits(38));
    }

    private static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

}
