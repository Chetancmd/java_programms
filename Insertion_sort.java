public class Insertion_sort {

    public static void Ins_Sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int back = i - 1;

            while (back >= 0 && arr[back] > current) {
                arr[back + 1] = arr[back];
                back--;
            }
            arr[back + 1] = current;
        }
    }

    public static void Print_Function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 2, 3, 5 };

        Ins_Sort(arr);
        Print_Function(arr);

    }

}
