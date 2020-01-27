package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void TestToString() {
        Shop s = new Shop("Walmart", "Retail store", "$");
        String expected = "Name: Walmart, Description: Retail store, Price:$, Number of stars: null";
        String actual = s.toString();
        assertEquals(expected, actual);
    }

    @Test public void testAddMethod() {
        Shop store1 = new Shop("Walmart", "Retail store", "$");
        Shop store2 = new Shop("Whole Foods", "Organic grocery store", "$$$");

        Review review1 = new Review("Good place to shop for groceries not many options.", "Joy", 3.0);
        Review review2 = new Review("Fantastic selection, great service, some bargains premium prices.", "Brian", 5.0);
        Review review3 = new Review("I used to love going to whole foods in Bellevue, but now it looks more like a cash and carry and more times than not the vegetables are not up to par- it’s more like going to Trader Joe’s for vegetables", "Adam", 3.0);

        assertNull(store1.numStars);
        assertNull(store2.numStars);
        assertEquals(0, store1.starArr.size());
        assertEquals(0, store2.starArr.size());

        store1.addReview(review1);
        assertNotNull(store1.numStars);
        assertEquals(1, store1.starArr.size());
        assertEquals("Name: Walmart, Description: Retail store, Price:$, Number of stars: 3.0", store1.toString());

        store2.addReview(review2);
        assertNotNull(store2.numStars);
        assertEquals(1, store2.starArr.size());
        assertEquals("Name: Whole Foods, Description: Organic grocery store, Price:$$$, Number of stars: 5.0", store2.toString());

        store2.addReview(review3);
        assertNotNull(store2.numStars);
        assertEquals(2, store2.starArr.size());
        assertEquals("Name: Whole Foods, Description: Organic grocery store, Price:$$$, Number of stars: 4.0", store2.toString());
    }
}
