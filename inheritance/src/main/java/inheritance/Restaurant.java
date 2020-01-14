package inheritance;

import java.text.DecimalFormat;

public class Restaurant {
    public String name;
    public double startNumbers;
    public String price;

    public Restaurant(String name, int startNumbers, String price) {
        this.name = name;
        this.startNumbers = startNumbers;
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.0");
        return this.name + df.format(this.startNumbers) + this.price;
    }
}
