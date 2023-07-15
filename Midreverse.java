import java.util.*;

public class Midreverse {
    public static int revers(int key, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                for (int j = array[i]; j < array.length; j++) {
                    System.out.println(array[j]);
                }
                for (int k = 0; k < array[i] - 1; k++) {
                    System.out.println(array[k] + " ");
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers as size array want");
        int nums = sc.nextInt();

        int array[] = new int[nums];
        System.out.println("Enter the array element");
        for (int i = 0; i < nums; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the key that find in array");
        int key = sc.nextInt();

        // int array[] = { 1, 2, 3, 4, 5, 6 };
        revers(key, array);

    }
}