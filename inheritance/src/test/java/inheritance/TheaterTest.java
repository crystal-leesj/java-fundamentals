package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {
    @Test
    public void TestTheaterConstructor() {
        Theater t = new Theater("AMC");
        String expected = "Name: AMC";
        String actual = t.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void TestAddMovie() {
        Theater t = new Theater("AMC");
        t.addMovie("Parasite");
        String actual = t.toString();
        String expected = "Name: AMC, Movies: Parasite";
        assertEquals(expected, actual);
        t.addMovie("Little Women");
        actual = t.toString();
        expected = "Name: AMC, Movies: Parasite, Little Women";
        assertEquals(expected, actual);
        t.addMovie("The Gentlemen");
        actual = t.toString();
        expected = "Name: AMC, Movies: Parasite, Little Women, The Gentlemen";
        assertEquals(expected, actual);
    }

    @Test
    public void TestRemoveMovie() {
        Theater t = new Theater("AMC");
        t.addMovie("Parasite");
        String actual = t.toString();
        String expected = "Name: AMC, Movies: Parasite";
        assertEquals(expected, actual);
        t.addMovie("Little Women");
        actual = t.toString();
        expected = "Name: AMC, Movies: Parasite, Little Women";
        assertEquals(expected, actual);
        t.addMovie("The Gentlemen");
        actual = t.toString();
        expected = "Name: AMC, Movies: Parasite, Little Women, The Gentlemen";
        assertEquals(expected, actual);
        
        t.removeMovie("Little Women");
        actual = t.toString();
        expected = "Name: AMC, Movies: Parasite, The Gentlemen";
        assertEquals(expected, actual);
        t.removeMovie("The Gentlemen");
        actual = t.toString();
        expected = "Name: AMC, Movies: Parasite";
        assertEquals(expected, actual);
        t.removeMovie("Parasite");
        actual = t.toString();
        expected = "Name: AMC";
        assertEquals(expected, actual);
    }

    @Test
    public void TestTAddReview() {
        Theater t = new Theater("Cinemark Lincoln Square");
        String expected = "Name: Cinemark Lincoln Square";
        String actual = t.toString();
        assertEquals(expected, actual);

        t.addMovie("Parasite");
        actual = t.toString();
        expected = "Name: Cinemark Lincoln Square, Movies: Parasite";
        assertEquals(expected, actual);

        Review review1 = new Review("Excellent seating, great service, and good pop corn, all at a reasonable price.", "Jeff", 5.0, "Parasite");
        t.addReview(review1);
        assertEquals("Body: Excellent seating, great service, and good pop corn, all at a reasonable price., Author: Jeff, Number of stars: 5.0, Watched: Parasite", review1.toString());
        assertEquals("Name: Cinemark Lincoln Square, Number of stars: 5.0", t.toString());

        Review review2 = new Review("Factoria Cinemas offers a nicer experience for the same price.", "Maria", 2.0, "Little Women");
        t.addReview(review2);
        assertEquals("Body: Factoria Cinemas offers a nicer experience for the same price., Author: Maria, Number of stars: 2.0, Watched: Little Women", review2.toString());
        assertEquals("Name: Cinemark Lincoln Square, Number of stars: 3.5", t.toString());
    }
}
