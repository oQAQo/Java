package singleton;

public class Lazy {

    private Lazy() {
    }

    public static Lazy getInstance() {
        return LazyHolder.INSTANCE;
    }


    private static class LazyHolder {
        private static final Lazy INSTANCE = new Lazy();
    }

}

