import java.util.*;

public class kadane {

    public static void kadanes1(int numbers[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {

            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }
        System.out.println("max numbers is " + ms);
        System.out.println(numbers.length);

    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 1, -5, 7, 9, -1 };// zero will be applied on(adding both numbers=(-sign)) whole
                                                    // negative integer
        kadanes1(numbers);
    }

}
