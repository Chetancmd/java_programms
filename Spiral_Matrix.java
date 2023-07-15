public class Spiral_Matrix {

    public static void Spiral_Matrix1(int array[][]) {

        int startR = 0;
        int endR = array.length - 1;
        int startC = 0;
        int endC = array[0].length - 1;

        while (startR <= endR && startC <= endC) {

            for (int j = startC; j <= endC; j++) {

                System.out.print(array[startR][j] + " ");

            }

            for (int i = startR + 1; i <= endR; i++) {
                System.out.print(array[i][endC] + " ");
            }

            for (int k = endC - 1; k >= startC; k--) {

                if (startR == endR) {
                    break;
                }
                System.out.print(array[endR][k] + " ");
            }

            for (int l = endR - 1; l >= startR + 1; l--) {
                if (startC == endC) {
                    break;
                }
                System.out.print(array[l][startC] + " ");
            }
            startC++;
            startR++;
            endC--;
            endR--;

        }

    }

    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
                { 13, 14, 15 } };

        Spiral_Matrix1(array);
    }
}
