public class SingleTonThreadSafe {

    private static SingleTonThreadSafe singleton;

    private SingleTonThreadSafe() {
        System.out.println("SingleTonThreadSafe");
    }

    public static SingleTonThreadSafe getInstance() {
        if (singleton == null) {
            synchronized (SingleTonThreadSafe.class) {
                if (singleton == null) {
                    singleton = new SingleTonThreadSafe();
                }
            }
        }
        return singleton;
    }
}
