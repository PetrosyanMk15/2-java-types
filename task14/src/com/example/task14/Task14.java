package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        int y = 0;
        while(value != 0)
        {
            y = y*10 + value%10;
            value /= 10;
        }
        return y;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
