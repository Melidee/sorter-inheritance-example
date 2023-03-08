public abstract class ElectronicProduct extends Product {
    private String brand;
    private int batteryLifeMa;

    public ElectronicProduct(double price, int stock, String brand, int batteryLifeMa) {
        super(price, stock);
        this.brand = brand;
        this.batteryLifeMa = batteryLifeMa;
    }

    public void charge(int amount) {
        batteryLifeMa += amount;
    }

    public static String compatible(ElectronicProduct a, ElectronicProduct b) {
        if (a.getBrand().equals("Apple") && b.getBrand().equals("Apple")
            || !a.getBrand().equals("Apple") && !b.getBrand().equals("Apple")) {
                return "Probably";
            } else {
                return "Probably not";
            }
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBatteryLifeMa() {
        return this.batteryLifeMa;
    }

    public void setBatteryLifeMa(int batteryLifeMa) {
        this.batteryLifeMa = batteryLifeMa;
    }    
}