package HomeWork6;

public class ArrayUtil {
    public static void main(String[] args) {
        //1
        int[] array = {6, 26, 34, 12, 1, 10, 48, 54, 94, 57};
        //2
        int[] array2 = {75, 26, 31, 12, 1, 10, 48, 56, 97, 67};
        //3
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
      //4
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        ArrayDemo au = new ArrayDemo();
        au.MaxOfArray(array);
        au.minOfArray(array);
        au.evenOfArray(array2);
        au.oddOfArray(array2);
        au.firstOfArray(array2);
        au.lastOfArray(array2);
        au.quantityOfO(chars);
        au.reviewOfChars2(chars2);

    }
}
