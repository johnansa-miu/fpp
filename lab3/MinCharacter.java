package lab3;

public class MinCharacter {
    /**
     * Public utility method to find the minimum character in a string.
     * @param str Input string
     * @return Minimum character in the string
     */
    public static char findMinCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        return findMinCharacter(str, 0);
    }

    /**
     * Private recursive method to find the minimum character.
     * @param str Input string
     * @param position Current index
     * @return Minimum character
     */
    private static char findMinCharacter(String str, int position) {
        char minChar = str.charAt(position);

        if (position == str.length() - 1) {
            return minChar;
        }

        char newMinChar = findMinCharacter(str, position + 1);

        return (minChar < newMinChar) ? minChar : newMinChar;
    }

    public static void main(String[] args) {
        String input = "john";
        System.out.println("Minimum character: " + findMinCharacter(input));
    }
}
