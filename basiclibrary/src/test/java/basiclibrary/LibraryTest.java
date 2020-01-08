/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRollMethod() {
        int number = 4;
        int[] result = Library.roll(number);
        assertEquals(number, result.length);
    }

    @Test public void testContainsDuplicatesFalseMethod() {
        int[] inputArr = {2,4,5,6,8};
        boolean actual = Library.containsDuplicates(inputArr);
        assertFalse(actual);
    }

    @Test public void testContainsDuplicatesTrueMethod() {
        int[] inputArr = {2,4,5,5,8};
        boolean actual = Library.containsDuplicates(inputArr);
        assertTrue(actual);
    }

    @Test public void testcalCulatingAveragesMethod() {
        int[] inputArr = {2,4,5,6,8};
        int actual = Library.calculatingAverages(inputArr);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test public void testArraysOfArraysMethod() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int actual = Library.arraysOfArrays(weeklyMonthTemperatures);
        int expected = 57;
        assertEquals(expected, actual);
    }
}
