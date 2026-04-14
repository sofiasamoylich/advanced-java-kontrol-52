package main.java.com.example;

public class OrderItem {
    private String name;
    private Money price;
    private int quantity;
    OrderItem(String name, Money price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getQuantity() {return quantity;}
    public Money getPrice() {return price;}
}
