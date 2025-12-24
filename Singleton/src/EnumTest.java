public class EnumTest {
    public static void main(String[] args) {

        EnumSigleTon logger= EnumSigleTon.Instance;

        logger.log("this is singleton using enum");
    }
}
