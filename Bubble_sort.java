public class Bubble_sort {
    public static void Bubble(int array[]) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;

                }
            }
        }
        System.out.println(count);
    }

    public static void Sorted_A(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int array[] = { 1, 3, 5, 6, 2, 4 };
        Bubble(array);
        Sorted_A(array);

    }

}
