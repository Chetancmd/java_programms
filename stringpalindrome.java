import java.util.*;

public class stringpalindrome {

    public static boolean palindrome1(String str) {

        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "121";
        System.out.println(palindrome1(name));

    }

}
