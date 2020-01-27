package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testRestaurantConstructor() {
        Restaurant r = new Restaurant("Boiling Point", "$$");
        String expected = "Name: Boiling Point, Price: $$, Stars: null";
        assertEquals(expected, r.toString());
    }

    @Test public void testAddReview() {
        Restaurant restaurant1 = new Restaurant("Boiling Point", "$$");
        Restaurant restaurant2 = new Restaurant("Minamoto", "$$$");

        Review review1 = new Review("A good dining experience, friendly staff, tasty hot soup.", "May", 4.0);
        Review review2 = new Review("Wrapped up in a reasonable price makes this a great place for a work lunch!", "Jason", 5.0);
        Review review3 = new Review("A popular chain restaurant. It was enjoyable but I feel for the price it's overpriced.", "May", 3.0);

        assertNull(restaurant1.numStars);
        assertNull(restaurant2.numStars);
        assertEquals(0, restaurant1.starArr.size());
        assertEquals(0, restaurant2.starArr.size());

        restaurant1.addReview(review1);
        assertNotNull(restaurant1.numStars);
        assertEquals(1, restaurant1.starArr.size());
        assertEquals("Name: Boiling Point, Price: $$, Stars: 4.0", restaurant1.toString());

        restaurant1.addReview(review3);
        assertEquals(2, restaurant1.starArr.size());
        assertEquals("Name: Boiling Point, Price: $$, Stars: 3.5", restaurant1.toString());

        restaurant2.addReview(review2);
        assertNotNull(restaurant2.numStars);
        assertEquals(1, restaurant2.starArr.size());
        assertEquals("Name: Minamoto, Price: $$$, Stars: 5.0", restaurant2.toString());
    }
}
