package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testToString() {
        Review r = new Review("A good dining experience, friendly staff, tasty hot soup.", "Crystal", 4.0);
        String expected = "Body: A good dining experience, friendly staff, tasty hot soup., Author: Crystal, Number of stars: 4.0";
        assertEquals(expected, r.toString());

        Theater t = new Theater("Cinemark Lincoln Square");
        expected = "Name: Cinemark Lincoln Square";
        String actual = t.toString();
        assertEquals(expected, actual);

        Review review1 = new Review("Excellent seating, great service, and good pop corn, all at a reasonable price.", "Jeff", 5.0, "Parasite");
        t.addReview(review1);
        assertEquals("Body: Excellent seating, great service, and good pop corn, all at a reasonable price., Author: Jeff, Number of stars: 5.0, Watched: Parasite", review1.toString());
    }
}
