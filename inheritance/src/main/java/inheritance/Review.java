package inheritance;

public class Review {
    public String body;
    public String author;
    public int startNumbers;

    public Review (String body, String author, int startNumbers){
        this.body = body;
        this.author = author;
        this.startNumbers = startNumbers;
    }

    @Override
    public String toString() {
        return ("Body: " + this.body + ", Author: " + this.author + ", Number of stars: " + this.startNumbers);
    }
}
