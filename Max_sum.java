import java.util.*;

public class Max_sum {

    public static int Subarray1(int numbers[]) {

        int current = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                current = 0;

                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k] + " ");
                    current += numbers[k];
                }
                System.out.println(current);
                if (maxSum < current) {
                    maxSum = current;
                }

            }

        }
        // System.out.println("max number is" + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        // Subarray1(numbers);
        System.out.println("max number is" + Subarray1(numbers));
    }
}
