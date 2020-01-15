package inheritance;

import java.util.ArrayList;

public class Shop {
    public String name;
    public String description;
    public String price;
    public String body;
    public String author;
    public int startNumbers;


    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.startNumbers = 0;
    }


    @Override
    public String toString() {
        String shopInfo = "Name: " + this.name + ", Description: " + this.description + ", Price:" + this.price + "\n";
        String review = "Name: "+ this.author + ", Stars: "+ this.startNumbers + ", Review:  " + this.body + "\n";
        boolean bool = this.startNumbers == 0 && this.author == null && this.body == null;
        return bool ? shopInfo : shopInfo+review;
    }

    public void addReview(Review review) {

        ArrayList<Integer> starArr = new ArrayList<>();
        starArr.add(review.startNumbers);
        if (this.startNumbers <= 0){
            int sum = this.startNumbers + review.startNumbers;
            this.startNumbers = sum / starArr.size();
        } else {
            int sum = this.startNumbers +review.startNumbers;
            this.startNumbers = sum / (starArr.size() + 1);
        }

        this.body = review.body;
        this.author = review.author;

    }
}
