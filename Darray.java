import java.util.*;

public class Darray {

    public static void Two_dimension_array(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static void Two_dimension_Key_Search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {

                    System.out.println("Element found at index " + i + "," + j + " ");
                }

            }
        }
    }

    public static void max(int matrix[][]) {
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (largest > matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("small no. is" + largest);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int a = sc.nextInt();
        System.out.println("enter the column");
        int b = sc.nextInt();

        int matrix[][] = new int[a][b];
        int key = 9;

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the array");
                matrix[i][j] = sc.nextInt();

            }
        }
        Two_dimension_array(matrix);
        Two_dimension_Key_Search(matrix, key);
        max(matrix);

    }

}
