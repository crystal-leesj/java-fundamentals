package inheritance;

import java.util.ArrayList;

public class Shop {
    public String name;
    public String description;
    public String price;
    public Double numStars;
    ArrayList<Review> reviewsArr = new ArrayList<>();
    ArrayList<Double> starArr = new ArrayList<Double>();

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.numStars = null;
    }


    @Override
    public String toString() {
        String shopInfo = "Name: " + this.name + ", Description: " + this.description + ", Price:" + this.price + ", Number of stars: " + this.numStars;
//        String review = "Name: "+ this.author + ", Stars: "+ this.numStars + ", Review:  " + this.body + "\n";
        return shopInfo;
//        boolean bool = this.numStars == null && this.author == null && this.body == null;
//        return bool ? shopInfo : shopInfo+review;
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
