import java.util.*;

public class ArrayCC {

    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter phy marks");
        marks[0] = sc.nextInt();
        System.out.println("enter math marks");
        marks[1] = sc.nextInt();
        System.out.println("enter eng marks");
        marks[2] = sc.nextInt();

        System.out.println("phy marks is:" + marks[0] + "   math marks is:" + marks[1] + "   eng marks is:" + marks[2]);
        System.out.println("You got " + (marks[0] + marks[1] + marks[2]) / 3 + "% in exam");
    }
}
