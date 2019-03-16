package singleton;

import java.util.concurrent.CountDownLatch;

public class Test implements Runnable {

    CountDownLatch latch = null;

    public Test(CountDownLatch latch) {
        this.latch = latch;

    }

    public void run() {
        try {
            System.out.println("---------------阻塞------------");

            latch.countDown();
            latch.await();

            System.out.println("--------------已释放--------------");
            Lazyenum starving = Lazyenum.INSTANCE;

            System.out.println(starving);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
