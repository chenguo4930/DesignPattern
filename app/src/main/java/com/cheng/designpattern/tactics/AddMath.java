package com.cheng.designpattern.tactics;

/**
 * @author ChengGuo
 * @date 2019/3/14
 */
public class AddMath implements IMathTactics {

    @Override
    public int doMath(int a, int b) {
        return a + b;
    }
}
