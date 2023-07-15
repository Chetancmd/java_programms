import java.util.*;

public class Large_Small_Values_Array {

    public static int Large_Small(int numbers[]) {

        int largest = Integer.MIN_VALUE; // -INFINITY
        int smallest = Integer.MAX_VALUE; // +INFINITY

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {

                largest = numbers[i];
            }
            if (smallest > numbers[i]) {

                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("largest number is " + Large_Small(numbers));
    }
}
