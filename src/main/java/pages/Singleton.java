package pages;

public class Singleton {
    private static Singleton x;

    static {
        try {
            x = new Singleton();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Singleton() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static Singleton getInstance() {
        return x;
    }

//    public static Singleton getInstance() {
//        if (x == null) {
//            x = new Singleton();
//        }
//
//        return x;
//    }
}
