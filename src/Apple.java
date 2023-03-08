public class Apple extends Product {
    private int daysToExpire;

    public Apple(double price, int stock, int daysToExpire) {
        super(price, stock);
        this.daysToExpire = daysToExpire;
    }

    public boolean expired() {
        return daysToExpire > 0;
    }

    public void passDay() {
        daysToExpire -= 1;
    }

    public int getDaysToExpire() {
        return this.daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }
}
