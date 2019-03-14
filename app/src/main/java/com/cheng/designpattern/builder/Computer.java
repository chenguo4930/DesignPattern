package com.cheng.designpattern.builder;

/**
 * 计算机抽象类，相当于Product角色
 */
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {

    }

    /**
     * 设置主板
     *
     * @param board
     */
    protected void setBoard(String board) {
        mBoard = board;
    }

    /**
     * 设置显示器
     *
     * @param display
     */
    protected void setDisplay(String display) {
        mDisplay = display;
    }

    /**
     * 设置主板
     */
    protected abstract void setOS();

    @Override
    public String toString() {
        return "Computer [mBoard = " + mBoard + ", mDisplay = " + mDisplay + ", mOS = " + mOS + "]";
    }
}
