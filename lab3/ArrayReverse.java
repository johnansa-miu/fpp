package lab3;

import java.util.Arrays;

public class ArrayReverse {
    /**
     * Public utility method to reverse an array.
     * @param arr Input array
     */
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        reverseHelper(arr, 0, arr.length - 1);
    }

    /**
     * Private recursive method to reverse the array.
     * @param arr Input array
     * @param left Start index
     * @param right End index
     */
    private static void reverseHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseHelper(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reverse: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After Reverse: " + Arrays.toString(arr));
    }
}
