package main.java.com.example;

import main.java.com.example.payment.PaymentMethod;

import java.util.Arrays;

public class Order {
    private String id;
    private OrderStatus status;
    private Email email;
    private Money total;
    private PaymentMethod paymentMethod;
    private OrderItem[] items;
    Order(String id, OrderStatus status, Email email, Money total, PaymentMethod paymentMethod, OrderItem[] items) {
        this.id = id;
        this.status = OrderStatus.NEW;
        this.email = email;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.items = Arrays.copyOf(items, items.length);
    }
    public Email getEmail() {return email;}
    public Money getTotal() {return total;}
    public OrderStatus getStatus() {return status;}
    public PaymentMethod getPaymentMethod() {return paymentMethod;}

    public void setTotal(Money total) {
        this.total = total;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
