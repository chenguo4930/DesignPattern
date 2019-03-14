package com.cheng.designpattern.Tactics;

/**
 * @author ChengGuo
 * @date 2019/3/14
 */
public class SubMath implements IMathTactics {

    @Override
    public int doMath(int a, int b) {
        return a - b;
    }
}
