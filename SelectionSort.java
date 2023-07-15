import java.util.*;

public class SelectionSort {

    public static void Selection_sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int first = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[first] > arr[j]) {
                    first = j;
                }

                // swap
                int temp = arr[first];
                arr[first] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void Print_Function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 6, 2, 1 };

        Selection_sort(arr);
        Print_Function(arr);

    }
}
