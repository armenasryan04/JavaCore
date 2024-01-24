package homeworks.homework5;

public class ArraySortDemo {
    public static void main(String[] args) {

        ArraySort arraySort = new ArraySort();
        int[] array = {43, 55, 5 , 2 , 4 , 6 };
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();
        arraySort.sortArray(array);
        for (int i: array) {
            System.out.print(i + " ");
        }
    }


}
