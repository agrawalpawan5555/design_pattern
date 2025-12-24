public class OrderStatusDemo {

    public static void main(String[] args) {
        OrderStatus orderStatus = OrderStatus.PROCESSING;
        System.out.println(orderStatus.toString());
        System.out.println(orderStatus.getCode());
    }
}
