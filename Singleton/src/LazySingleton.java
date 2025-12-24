public class LazySingleton {

    private LazySingleton() {
        System.out.println("Lazy Singleton");
    }
    private static LazySingleton instance;

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
