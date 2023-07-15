import java.util.*;

public class Soldier_Leetcode {

    public static void Two_dimension_array(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                int count = 0;

                if (matrix[i][j] == 1) {

                    count++;
                }
                if (count <= key) {
                    System.out.print("Weaker row is" + matrix[i]);
                    break;
                }

            }
            // System.out.println();
        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 0, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 1, 1, 1 } };
        int key = 3;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the row");
        // int a = sc.nextInt();
        // System.out.println("enter the column");
        // int b = sc.nextInt();

        // int matrix[][] = new int[a][b];
        // System.out.println("Enter the key");
        // int key = sc.nextInt();

        // int n = matrix.length;
        // int m = matrix[0].length;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print("Enter the array");
        // matrix[i][j] = sc.nextInt();

        // }
        // }
        Two_dimension_array(matrix, key);

    }
}