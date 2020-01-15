package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Restaurant {
    public String name;
    public double startNumbers;
    public String price;

//    Restaurant Constructor
    public Restaurant(String name, double startNumbers, String price) {
        this.name = name;
        this.startNumbers = startNumbers;
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", Number of stars: " + this.startNumbers + ", Price: " + this.price);
    }

    public void addReview(Review review) {
        ArrayList<Integer> numStarsArr = new ArrayList<>();
        numStarsArr.add((int) review.startNumbers);
        double sum = this.startNumbers + review.startNumbers;
        if (this.startNumbers < 0) {
            this.startNumbers = sum / numStarsArr.size();
        } else {
            this.startNumbers = sum / (numStarsArr.size() + 1);
        }

    }
}
