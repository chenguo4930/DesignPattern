package com.cheng.designpattern.Builder;

public class BuilderTest {

    public static void main(String[] args) {
        //构造器
        Builder builder = new MateBookBuilder();
        //Director
        Director pcDirector = new Director(builder);
        //封装构建过程
        pcDirector.construct("华硕主板", "三星显示器");
        //构建计算机
        System.out.println("Computer Info :" + builder.create().toString());
    }
}
