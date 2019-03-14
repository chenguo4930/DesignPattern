package com.cheng.designpattern.producer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public class Producer extends Thread {
    private Resource resource;

    public Producer(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }
}
