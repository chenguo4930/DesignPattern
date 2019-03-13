package com.cheng.designpattern.Builder;

/**
 * 具体的Builder类
 */
public class MateBookBuilder extends Builder {
    private Computer mComputer = new MateBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
