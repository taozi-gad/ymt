package com.tju.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        long sum = 1L;
        for (int i = 5; i <= 100; i++){
            sum *= i;
        }
        System.out.println(sum);

    }
}
