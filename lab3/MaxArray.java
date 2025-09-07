package lab3;

public class MaxArray {
    /**
     * Public utility method to find max in an array.
     * @param arr Input array
     * @return Max value
     */
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        return max(arr, 0);
    }
    /**
     * Private recursive method to find max.
     * @param arr Input array
     * @param index Current index
     * @return Max value
     */
    private static int max(int[] arr, int index) {

        int currentMax = arr[index];

        if (index == arr.length - 1) {
            return currentMax;
        }

        int newMax = max(arr, index + 1);

        return Math.max(currentMax, newMax);

    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4};
        System.out.println("Max = " + max(arr));
    }
}
