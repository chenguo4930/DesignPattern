package com.cheng.designpattern.tactics;

/**
 * 策略模式
 *
 * @author ChengGuo
 * @date 2019/3/14
 */
public class TacticsTest {

    public static void main(String[] args) {

        Computer computerAdd = new Computer(new AddMath());
        Computer computerSub = new Computer(new SubMath());

        System.out.println("-------computerAdd:" + computerAdd.doMath(5, 2));
        System.out.println("-------computerSub:" + computerSub.doMath(5, 2));
    }
}
