import java.util.*;

public class hollow {

    public static void hollow_Rect(int TotR, int TotC) {
        for (int i = 1; i <= TotR; i++) {
            for (int j = 1; j <= TotC; j++) {

                if (i == 1 || i == TotR || j == 1 || j == TotC) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        hollow_Rect(4, 5);

    }
}
