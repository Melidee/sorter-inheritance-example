public class Phone extends ElectronicProduct {
    private double cameraMp;

    public Phone(double price, int stock, String brand, int batteryLifeMa, double cameraMp) {
        super(price, stock, brand, batteryLifeMa);
        this.cameraMp = cameraMp;
    }

    // art from https://www.asciiart.eu/
    public String getPhoto() {
        return 
        "     \\\\   \n" + 
        "     (o>  \n" + 
        " \\\\_//)   \n" + 
        "  \\_/_)  \n" +  
        "   _|_    \n";
    }

    public String getCameraQuality() {
        if (cameraMp <= 8.0) {
            return "not too great";
        } else if (8.0 < cameraMp && cameraMp < 20.0) {
            return "decent";
        } else {
            return "great";
        }
    }

    public double getCameraMp() {
        return this.cameraMp;
    }

    public void setCameraMp(double cameraMp) {
        this.cameraMp = cameraMp;
    }
}