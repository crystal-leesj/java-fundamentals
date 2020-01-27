package inheritance;

public class Review {
    public String body;
    public String author;
    public Double numStars;
    public String movie;

    public Review (String body, String author, Double numStars){
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }

    public Review (String body, String author, Double numStars, String movie){
        this.body = body;
        this.author = author;
        this.numStars = numStars;
        this.movie = movie;
    }


    @Override
    public String toString() {
        if (this.movie == null) {
            return ("Body: " + this.body + ", Author: " + this.author + ", Number of stars: " + this.numStars);
        } else {
            return ("Body: " + this.body + ", Author: " + this.author + ", Number of stars: " + this.numStars + ", Watched: " + this.movie);
        }
    }
}
