package singleton;

import java.util.concurrent.CountDownLatch;

public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        int count=200;
CountDownLatch latch=new CountDownLatch(count);
        while(count>0){
            Thread thread=new Thread(new Test(latch));
            thread.start();

            count--;
        }


    }
}
