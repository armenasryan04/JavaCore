package HomeWork5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        boolean sort = false;
        int x;
        while (!sort) {
            sort = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    sort = false;
                    x = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = x;
                }
            }
        }
        System.out.print("From small to large: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");

        }
        System.out.println();
        boolean sort2 = false;
        int d;
        while (!sort2) {
            sort2 = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    sort2 = false;
                    d = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = d;
                }
            }
        }
        System.out.print("From large to small: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");
        }
    }
}










