import java.util.*;

public class isprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // int a=2;
        for (int i = 2; i < 5; i++) {
            if (i == 4) {
                break;

            } else {
                sum = n % i;
                if (sum == 0) {
                    System.out.println("is not a prime number");
                }
                System.out.println("prime");

            }

        }

    }

}
