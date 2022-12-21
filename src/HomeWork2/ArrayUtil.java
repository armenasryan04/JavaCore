package HomeWork2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {6, 26, 34, 12, 1, 10, 48, 54, 94, 57};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        int x = array[0];
        for (int j : array) {
            if (j > x) {
                x = j;

            }


        }
        System.out.println();
        System.out.println("max:" + x);
        for (int c : array) {
            if (c < x) {
                x = c;

            }

        }
        System.out.println("min:" + x);

    }
}
