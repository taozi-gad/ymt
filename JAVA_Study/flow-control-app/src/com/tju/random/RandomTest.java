package com.tju.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int data = r.nextInt(100);

        for (int i = 0; i<10; i++){
            System.out.print("请输入数字:");
            int inputData = sc.nextInt();
            if (inputData > data) {
                System.out.println("大了");
            } else if (inputData < data) {
                System.out.println("小了");
            }else {
                System.out.println("猜对了");
                System.out.println("数字是： " + data);
                break;
            }
        }
    }
}
