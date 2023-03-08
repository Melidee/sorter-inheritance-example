public class Laptop extends ElectronicProduct {
    private double processorSpeedGHz;

    public Laptop(double price, int stock, String brand, int batteryLifeMa, double processorSpeedGHz) {
        super(price, stock, brand, batteryLifeMa);
        this.processorSpeedGHz = processorSpeedGHz;
    }

    public double speedInHz() {
        return processorSpeedGHz * 1000000000;
    }

    public boolean fastEnough(double requirement) {
        return processorSpeedGHz > requirement;
    }

    public double getProcessorSpeedGHz() {
        return this.processorSpeedGHz;
    }

    public void setProcessorSpeedGHz(double processorSpeedGHz) {
        this.processorSpeedGHz = processorSpeedGHz;
    }    
}
