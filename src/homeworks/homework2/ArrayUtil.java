package homeworks.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 23, 21, 44, 79, 8, 65, 56, 41};
        //print array
        System.out.println("print all numbers of array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        // print max num of array
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("\n print max of array");
        System.out.println("max num =" + max);
        // print min num of array
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("\nprint min of array");
        System.out.println("min num =" + min);
        System.out.println("\n" + "print the quantity of even numbers ");
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                quantity++;
            }
        }
        System.out.println(quantity);
        quantity = 0;
        System.out.println("\n" + "print the quantity of odd numbers ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                quantity++;
            }
        }
        System.out.println(quantity);
        System.out.println("\n" + "print the  even numbers ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("\n" + "print the odd numbers ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("\n" + "print the sum off all elements");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        System.out.println("\n the arithmetic average off array");
        int average = sum / array.length;
        System.out.println(average);
        System.out.println("\n print first num");
        System.out.println(array[0]);
        System.out.println("\n print last num");
        System.out.println(array[array.length-1]);
        System.out.println("\n print middle num");
        System.out.println(array[array.length/2]);
    }

}
