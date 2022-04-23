package leetcode_16;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author:Test
 * @DATE:2021/7/3115:18
 **/
public class Test {

    public static void main(String[] args) {

        for (int i =0;i < 900 ; i++) {
            VolatileExample1 volatileExample = new VolatileExample1();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("A:" + Thread.currentThread());
                    volatileExample.writer();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("B:" + Thread.currentThread());
                    volatileExample.reader();
                }
            }).start();
            try{
                Thread.sleep(10);
            }catch (Exception e){

            }
        }
    }

}
