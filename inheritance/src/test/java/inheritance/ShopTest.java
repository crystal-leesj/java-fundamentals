package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void TestToString() {
        Shop s = new Shop("Walmart", "Retail store", "$");
        String expected = "Name: Walmart, Description: Retail store, Price:$" + "\n";
        String actual = s.toString();
        assertEquals(expected, actual);
    }

    @Test public void testAddMethod() {
        Shop actual = new Shop("Walmart", "Good place to shop for groceries not many options.", "$");
        actual.startNumbers = 3;

        Review walmart = new Review("Good place to shop for groceries not many options.", "Joy", 3);
        String expected = "Name: Joy, Stars: 3, Review: Good place to shop for groceries not many options., Price:$";
        System.out.println("expected = " + expected);
        actual.addReview(walmart);
        System.out.println("actual = " + actual);
        assertEquals(expected, actual.toString());
    }
}
