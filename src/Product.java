public abstract class Product {
    private double price;
    private int stock;

    public Product(double price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public double buy(int amount, double balance) {
        double cost = price * amount;
        if (balance > cost) {
            return balance - cost;
        } else {
            return balance;
        }
    }

    public void restock(int amount) {
        stock += amount;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}