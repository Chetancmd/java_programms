import java.util.*;

public class recursionbasics {

    public static int TilingProblems(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = TilingProblems(n - 1);
        int fnm2 = TilingProblems(n - 2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void decnum(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decnum(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        // decnum(n);
        System.out.println(TilingProblems(n));

    }
}