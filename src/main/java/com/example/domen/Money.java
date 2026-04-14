package main.java.com.example;

public class Money {
    private double amount;
    Money(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Double.compare(money.amount, amount) == 0;
    }
    @Override
    public int hashCode() {
        return Double.hashCode(amount);
    }
}
