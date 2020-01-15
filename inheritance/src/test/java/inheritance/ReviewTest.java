package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testToString() {
        Review boilingPoint = new Review("A good dining experience, friendly staff, tasty hot soup.", "Crystal", 4.0);
        String expected = "Body: A good dining experience, friendly staff, tasty hot soup., Author: Crystal, Number of stars: 4.0";
        assertEquals(expected, boilingPoint.toString());
    }
}
