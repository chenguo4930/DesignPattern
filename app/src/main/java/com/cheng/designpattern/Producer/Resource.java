package com.cheng.designpattern.Producer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public class Resource {
    private int num;
    private int size;

    public synchronized void remove(){
        if (num > 0){
            num--;
            notifyAll();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void add(){
        if (num < size){
            num++;
            notifyAll();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
