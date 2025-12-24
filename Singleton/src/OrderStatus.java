public enum OrderStatus {
    CREATED(200),
    PROCESSING(300),
    PROCESSED(500);

    private int code;
    OrderStatus(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
