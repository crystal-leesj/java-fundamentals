package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testRestaurantConstructor() {
        Restaurant r = new Restaurant("Boiling Point", 3, "$$");
        String expected = "Name: Boiling Point, Number of stars: 3, Price: $$";
        assertEquals(expected, r.toString());
    }

    @Test public void testAddReview() {
        Restaurant actual = new Restaurant("Minamoto", 4, "$$$");
        Review Minamoto = new Review("Wrapped up in a reasonable price makes this a great place for a work lunch!", "Jason", 5);

        String expected = "Name: Minamoto, Number of stars: 4, Price: $$$";
        actual.addReview(Minamoto);

        assertEquals(expected, actual.toString());
    }
}
