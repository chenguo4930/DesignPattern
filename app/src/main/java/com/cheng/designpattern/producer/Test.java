package com.cheng.designpattern.producer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public class Test {

    public static void main(String[] args) {
        Resource resource = new Resource();

        Producer producer1 = new Producer(resource);
        Producer producer2 = new Producer(resource);
        Producer producer3 = new Producer(resource);
        Consumer consumer1 = new Consumer(resource);

        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
    }
}
