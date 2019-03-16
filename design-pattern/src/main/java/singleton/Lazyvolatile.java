package singleton;

public class Lazyvolatile {

    public static volatile Lazyvolatile lazyvolatile = null;

    private Lazyvolatile() {
    }

    public static Lazyvolatile getInstance() throws  Exception{

        Thread.sleep(10);
        if (lazyvolatile == null) {
            Thread.sleep(10);
            synchronized (Lazyvolatile.class) {
                Thread.sleep(10);
                if (lazyvolatile == null) {

                    lazyvolatile = new Lazyvolatile();
                }
            }
        }
        return lazyvolatile;

    }
}
