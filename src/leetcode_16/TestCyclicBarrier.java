package leetcode_16;

import java.util.concurrent.CyclicBarrier;

/**
 * @author:TestCyclicBarrier
 * @DATE:2021/8/3022:18
 **/
public class TestCyclicBarrier {

    static CyclicBarrier c = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                    String
                }catch (Exception e){

                }
                System.out.println(1);
            }
        }).start();
        try {
            c.await();
        }catch (Exception e) {

        }
        System.out.println(2);

    }

    static class A implements Runnable{

        @Override
        public void run() {
            System.out.println(3);
        }
    }

}
