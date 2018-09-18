package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long longNumber = Long.parseLong(input);

        if (longNumber <= Byte.MAX_VALUE && longNumber >= Byte.MIN_VALUE)
            return "byte";
        else if (longNumber <= Short.MAX_VALUE && longNumber >= Short.MIN_VALUE)
            return "short";
        else if (longNumber <= Integer.MAX_VALUE && longNumber >= Integer.MIN_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {

       /* String result = solution("12345");
        System.out.println(result);*/
    }

}