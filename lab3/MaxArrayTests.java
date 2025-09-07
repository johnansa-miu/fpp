package lab3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxArrayTests {

    @Test
    public void testSingleElementArray() {
        int[] arr = {42};
        assertEquals(42, MaxArray.max(arr));
    }

    @Test
    public void testAllPositiveNumbers() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(9, MaxArray.max(arr));
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] arr = {-10, -20, -5, -30};
        assertEquals(-5, MaxArray.max(arr));
    }

    @Test
    public void testMixedNumbers() {
        int[] arr = {-3, 0, 7, -1, 4};
        assertEquals(7, MaxArray.max(arr));
    }

    @Test
    public void testDuplicateMaxValues() {
        int[] arr = {2, 7, 7, 3};
        assertEquals(7, MaxArray.max(arr));
    }

    @Test
    public void testThrowsOnEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> MaxArray.max(new int[] {}));
    }

    @Test
    public void testThrowsOnNullArray() {
        assertThrows(IllegalArgumentException.class, () -> MaxArray.max(null));
    }
}