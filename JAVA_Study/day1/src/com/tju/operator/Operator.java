package com.tju.operator;

public class Operator {
    public static <string> void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        // JAVA中两个整数相除还是整数
        System.out.println(1.0 * b / a);

        //取余
        System.out.println(3 % 2);

        String c = "zxvc";
        System.out.println(c + a);

        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println("------------------------------");

        int i = 10;
        int re = i++;
        System.out.println(re);
        System.out.println(i);
        System.out.println("-----------");

        int j = 10;
        int re2 = ++j;
        System.out.println(re2);
        System.out.println(j);

        System.out.println("---------------");

        // 三元运算
        double score = 90;
        String mm = score >= 60 ? "及格" : "不及格";
        System.out.println(mm);

        // 找较大的数 输出
        int v = 99;
        int d = 69;
        int max = v > d ? v : d;
        System.out.println(max);

        //三个中的最大
        int w = 10;
        int e = 45;
        int r = 34;

        int tmp = w > e ? w:e;
        int max2 = tmp > r ? tmp : r;
        System.out.println(max2);


    }
}
















