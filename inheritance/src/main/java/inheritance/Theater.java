package inheritance;

import java.util.ArrayList;

public class Theater {
    public String name;
    public Double numStars;
    ArrayList<String> showings = new ArrayList<String>();
    ArrayList<Review> reviewsArr = new ArrayList<>();
    ArrayList<Double> starArr = new ArrayList<Double>();

    public Theater(String name) {
        this.name = name;
        this.numStars = null;
    }

    @Override
    public String toString() {
        if (this.showings.size() == 0 && this.reviewsArr.size() == 0) {
            return ("Name: " + this.name);
        } else if (this.showings.size() != 0 && this.reviewsArr.size() == 0) {
            String theaterInfo = "Name: " + this.name + ", Movies: ";
            for (int i = 0; i < this.showings.size(); i++) {
                if (i != this.showings.size()-1) {
                    theaterInfo += this.showings.get(i) + ", ";
                }
                else {
                    theaterInfo += this.showings.get(i);
                }
            }
            return theaterInfo;
        } else {
            return ("Name: " + this.name + ", Number of stars: " + this.numStars);
        }
    }

    public void addMovie(String movie) {
        showings.add(movie);
    }

    public void removeMovie(String movie) {
        showings.remove(new String(movie));
    }

    public void addReview(Review review) {
        if (this.showings.size() != 0) {
            this.reviewsArr.add(review);
            starArr.add(review.numStars);
            Double avg = 0.0;
            for (Double star : starArr) {
                avg +=star;
            }
            this.numStars = avg/starArr.size();
        }
    }
}
