public class Shirt extends Product {
    private String size;

    public Shirt(double price, int stock, String size) {
        super(price, stock);
        this.size = size;
    }

    public boolean fits(String correctSize) {
        return this.size.equals(correctSize);
    }

    // art from https://www.asciiart.eu/
    public String lookAt() {
        return "   __   __    \n" + 
        "  /  `-'  \\  \n" + 
        " /_| R   |_\\ \n" + 
        "   |  E  |    \n" + 
        "   |   M |    \n" + 
        "   |_____|    \n";
    }
}

