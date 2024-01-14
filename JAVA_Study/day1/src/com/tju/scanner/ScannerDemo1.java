package com.tju.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年龄");
        //等待输入
        int age = sc.nextInt();
        System.out.println("年龄是："+ age);

        System.out.println("输入名字");
        String name = sc.next();
        System.out.println(name + "欢迎进入");


    }
}
