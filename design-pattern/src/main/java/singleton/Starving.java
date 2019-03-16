package singleton;

public class Starving {

    private static Starving starving;

    private Starving() {

    }

    public synchronized static Starving getInstance() throws InterruptedException {
        if (starving == null) {
            Thread.sleep(10);
            starving = new Starving();
        }

        return starving;
    }
}
