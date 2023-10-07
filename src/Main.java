import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {6.0, 4.5, -2.5, 1.7, -2.2, 4.9, -0.8, 6.8, -1.1, 4.2, -6.6, 9.2, -5.4, 5.8, 0.1};

        double sumPositive = 0;
        int countPositive = 0;
        boolean negativeFound = false;

        for (double num : numbers) {
            if (num < 0) {
                negativeFound = true;
            } else if (negativeFound) {
                sumPositive += num;
                countPositive++;
            }
        }

        double averagePositive = sumPositive / countPositive;
        System.out.println(averagePositive);

        int[] arr = {-8, -4, -2, 2, 3, 6, -7};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}