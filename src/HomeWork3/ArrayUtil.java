package HomeWork3;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {75, 26, 31, 12, 1, 10, 48, 56, 97, 67};
        System.out.print("my array:");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
        int b = 0;
        System.out.print("The even numbers is:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                b++;
                int c = array[i];
                System.out.print(c + ",");
            }
        }
        System.out.println();
        System.out.println("quantity of the even nums is:" + b);
        System.out.println();
        System.out.print("The odd numbers is:");
        int x = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                x++;
                int t = i;
                System.out.print(t + ",");
            }
        }
        System.out.println();
        System.out.println("quantity of the odd nums is:" + x);
        System.out.println();
        System.out.print("Tveri mijin tvabanakany:");
        for (int i : array) {
            System.out.print(i / array.length + ",");
        }
        System.out.println();
        System.out.println("first num :" + array[0]);
        System.out.println();
        for (int i = array.length - 1; i < array.length; i++) {
            System.out.println("last num:" + array[i]);
        }

    }
}







