package inheritance;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public int startNumbers;
    public String price;

//    Restaurant Constructor
    public Restaurant(String name, int startNumbers, String price) {
        this.name = name;
        this.startNumbers = startNumbers;
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", Number of stars: " + this.startNumbers + ", Price: " + this.price);
    }

    public void addReview(Review review) {
        ArrayList<Integer> starArr = new ArrayList<>();
        starArr.add(review.startNumbers);

        if (this.startNumbers < 0){
            float sum =this.startNumbers +review.startNumbers;
            this.startNumbers = (int) (sum / starArr.size());
        }else{
            float sum =this.startNumbers +review.startNumbers;
            this.startNumbers = (int) (sum / (starArr.size() + 1));
        }

    }

}
