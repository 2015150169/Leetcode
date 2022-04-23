package leetcode_16;

import java.util.concurrent.ForkJoinPool;

/**
 * @author:VolatileExample
 * @DATE:2021/7/3115:15
 **/
public class VolatileExample {

    int a = 0;
    volatile boolean flag = false;
    int b = 0;
    ForkJoinPool f = new ForkJoinPool();
    public void writer(){
        a = 1;
//        try {
//            Thread.sleep(1111);
//        }catch (Exception e) {
//
//        }
//        for(int i =1; i < 1000000; i++) {
//            a = i;
//        }
//
        flag = true;
        for(int i =1; i < 1000000; i++) {

        }
        b = 1;
        a = 2;
        try {
            Thread.sleep(1111);
        }catch (Exception e) {

        }
    }

    public void reader(){

        if(flag){
            int i = a;
//            System.out.println("a:" + i + Thread.currentThread());
//            System.out.println("b:" + b + Thread.currentThread());
        }else {
//           System.out.println("a1:" + a + Thread.currentThread());
            int i = b;
            boolean temp = flag;
            System.out.println("b1:" + i + temp + Thread.currentThread());

            if(flag && i==0) {
                System.out.println("b2:" +a + ':' + b + Thread.currentThread());
            }
        }
    }

}
