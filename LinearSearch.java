import java.util.*;

public class LinearSearch {

    public static int Finder(int numbers[], int keys) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == keys) {

                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 40, 50, 39, 23, 27 };
        int key = 23;

        int index = Finder(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Element found at index " + index);
        }

    }
}
