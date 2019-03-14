package com.cheng.designpattern.producer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public class Consumer extends Thread {
    private Resource resource;

    public Consumer(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.remove();
        }
    }
}
