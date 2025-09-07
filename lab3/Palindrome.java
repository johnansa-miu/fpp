package lab3;

public class Palindrome {

    /**
     * Public utility method to check if a number is palindrome.
     * @param number Input number
     * @return True if palindrome, false otherwise
     */
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        if (number < 10) {
            return true; // Single digit is always palindrome
        }

        return isPalindromeRecursive(number, 0, number);
    }

    /**
     * Private recursive method to check palindrome.
     * @param original Input number
     * @param reversed Reversed number so far
     * @param remaining Number of digits
     * @return True if palindrome, false otherwise
     */
    private static boolean isPalindromeRecursive(int original, int reversed, int remaining) {
        if (remaining == 0) {
            return original == reversed;
        }

        int digit = remaining % 10;
        reversed = reversed * 10 + digit;
        remaining = remaining / 10;

        return isPalindromeRecursive(original, reversed, remaining);
    }
    public static void main(String[] args) {
        System.out.println("Is 121 palindrome? " + isPalindrome(121)); // true
        System.out.println("Is -121 palindrome? " + isPalindrome(-121)); // false
        System.out.println("Is 102 palindrome? " + isPalindrome(102)); // false
    }
}
