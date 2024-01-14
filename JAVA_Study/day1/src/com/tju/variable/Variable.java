package com.tju.variable;

/**
 * @author ymt
 */

public class Variable {
    public static void main(String[] args) {
        // int
        int age = 23;
        double score = 33.5;
        System.out.println(age);
        System.out.println("----------------------------");
        System.out.println(score);

        int age2 = age + 1;
        System.out.println(age2);
        age2 += 1;
        System.out.println(age2);

        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println(b3);

        // 强制类型转换
        int a = 15000;
        //出现报错后可以使用alt + enter
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

    }
}

