package com.cheng.designpattern.tactics;

/**
 * @author ChengGuo
 * @date 2019/3/14
 */
public class Computer {

    private IMathTactics mathTactics;

    public Computer(IMathTactics mathTactics) {
        this.mathTactics = mathTactics;
    }

    public int doMath(int a, int b) {
        return mathTactics.doMath(a, b);
    }
}
