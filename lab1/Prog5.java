public class Prog5 {

    public static void main(String[] args) {
        int[] array = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(array);
    }

    public static void secondMin(int[] arrayOfInts) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arrayOfInts) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        System.out.println("The second minimum is " + secondMin);
    }
}
