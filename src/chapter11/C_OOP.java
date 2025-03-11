package chapter11;

class Order{
    private String orderId;
    private int amount;

    public Order(String orderId, int amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId(){return orderId;}
    public int getAmount(){return amount;}
}

public class C_OOP {
}


