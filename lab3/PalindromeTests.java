package lab3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTests {
    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(1221));
        assertTrue(Palindrome.isPalindrome(0));
        assertTrue(Palindrome.isPalindrome(5));
        assertFalse(Palindrome.isPalindrome(102));
        assertFalse(Palindrome.isPalindrome(-121));
        assertFalse(Palindrome.isPalindrome(10));
    }
}
