package com.tju.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();


        for (int i = 0; i < 5; i++) {
            int data = r.nextInt(10);
            System.out.println(data);
        }
    }

}
