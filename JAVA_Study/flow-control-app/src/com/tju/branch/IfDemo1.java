package com.tju.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // 测体温
        // 大于37 报警
        double t = 38.9;
        if(t>37){
            System.out.println("高温");
        }

        System.out.println("-----------------");
        // 发红包，90钱够或余额不足

        double money = 89;
        if(money >= 90){
            System.out.println("发红包");

        }else{
            System.out.println("余额不足");
        }

        System.out.println("-----------------");


        // 评分级别
        int score = 78;
        if(score >= 0 && score <60){
            System.out.println("不及格");
        } else if (score >= 60 && score <80) {
            System.out.println("及格");
        } else if (score >= 80 && score <= 100) {
            System.out.println("优秀");
        }else {
            System.out.println("数据非法");
        }

    }
}
