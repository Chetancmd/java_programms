import java.util.*;

public class Array_assignment1 {

    public static boolean arraycc(int array[]) {
        // boolean a= true;
        // boolean c= false;

        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {

                if (array[i] == array[k]) {
                    return true;
                }

            }

        }
        return false;

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

        // int nums[] = {1,2,3,1};
        System.out.println(arraycc(array));
    }

}
