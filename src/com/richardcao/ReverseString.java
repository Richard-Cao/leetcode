package com.richardcao;

public class ReverseString {

    public static void main(String[] args) {
        System.out.printf(reverseString("hello"));
    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        char[] newChars = new char[length];
        for (int i = 0; i < length; i++) {
            newChars[i] = chars[length - i - 1];
        }
        return String.valueOf(newChars);
    }

}
