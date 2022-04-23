package leetcode_16;

import java.util.Set;

/**
 * @author:VolatileExample
 * @DATE:2021/7/3115:15
 **/
public class VolatileExample1 {

    int a = 0;
    boolean flag = false;
    int b = 0;

    public void writer(){
        a = 1;//不能和下面的flag重排，保证了在写flag之前，a已经刷到主内存
        flag = true;
        Set
        b = 1;
        System.out.println("b:" + b + Thread.currentThread());
    }

    public void reader(){
        if(flag){//不能和上面的flag重排
            int i = a;
            System.out.println("a1:" + i + Thread.currentThread());
            System.out.println("b1:" + b + Thread.currentThread());
        }else {
            System.out.println("flag:" + flag + Thread.currentThread());
            System.out.println("a1:" + a + Thread.currentThread());
            System.out.println("b1:" + b + Thread.currentThread());
        }

    }

}
