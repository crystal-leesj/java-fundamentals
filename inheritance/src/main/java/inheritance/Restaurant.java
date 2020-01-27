package inheritance;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public String price;
    public Double numStars;
    ArrayList<Review> reviewsArr = new ArrayList<>();
    ArrayList<Double> starArr = new ArrayList<Double>();

//    Restaurant Constructor
    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
        this.numStars = null;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", Price: " + this.price + ", Stars: " + this.numStars);
    }

    public void addReview(Review review) {
        this.reviewsArr.add(review);

        starArr.add(review.numStars);

        Double avg = 0.0;
        for (Double star : starArr) {
            avg +=star;
        }

        this.numStars = avg/starArr.size();
    }

}
