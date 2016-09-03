package com.richardcao;

/**
 * Created by richardcao on 16/9/1.
 */
public class SumOfTwoIntegers {

    public static void main(String[] args) {
        System.out.printf(String.valueOf(getSum(1, 2)));
    }

    private static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum, carry;
        sum = a ^ b;
        carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}
