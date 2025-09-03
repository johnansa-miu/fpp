import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {
        String[] input = {"horse", "dog", "cat", "horse", "dog"};
        String[] result = removeArrayDuplicates(input);

        System.out.println(Arrays.toString(result));
    }

    public static String[] removeArrayDuplicates(String[] array) {
        String[] temp = new String[array.length];
        int count = 0;

        for (String s : array) {
            if (s != null && !contains(temp, s, count)) {
                temp[count++] = s;
            }
        }

        String[] result = new String[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

    private static boolean contains(String[] array, String value, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(value)) return true;
        }
        return false;
    }
}