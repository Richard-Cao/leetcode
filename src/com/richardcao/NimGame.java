package com.richardcao;

/**
 * Created by richardcao on 16/6/15.
 */
public class NimGame {

    public static void main(String[] args) {
        System.out.printf(String.valueOf(canWinNim(5)));
    }

    private static boolean canWinNim(int n) {
        return n % 4 > 0;
    }
}
