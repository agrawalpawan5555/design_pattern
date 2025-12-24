public class EagarSingletonInstance {

    private static final EagarSingletonInstance instance = new EagarSingletonInstance();

    public static EagarSingletonInstance getInstance() {
        return instance;
    }
}
