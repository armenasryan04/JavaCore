package HomeWork6;

public class ArrayDemo {
    void MaxOfArray(int[] array) {
        int x = array[0];
        for (int j : array) {
            if (j > x) {
                x = j;
            }
        }
        System.out.println("Max:" + x);
    }

    void minOfArray(int[] array) {
        int x = array[0];
        for (int c : array) {
            if (c < x) {
                x = c;
            }
        }
        System.out.println("min:" + x);
    }

    void evenOfArray(int[] array) {
        int b = 0;
        System.out.print("The even numbers is:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                b++;
                int c = array[i];
                System.out.print(c + ",");
            }
        }
    }

    void oddOfArray(int[] array) {
        System.out.println();
        System.out.print("The odd numbers is:");
        for (int i : array) {
            if (i % 2 != 0) {
                int t = i;
                System.out.print(t + ",");
            }
        }
    }

    void firstOfArray(int[] array) {
        System.out.println();
        System.out.println("The first num:" + array[0]);
    }

    void lastOfArray(int[] array) {
        System.out.println("The last num" + array[array.length - 1]);
    }

    void quantityOfO(char[] chars) {
        char c = 'o';
        int quantity = 0;
        for (int i : chars) {
            if (c == i) {
                quantity++;
            }
        }
        System.out.println("quantity of c = " + quantity);
    }

    void reviewOfChars2(char[] chars) {
        for (int i = chars.length - 2; i < chars.length; i++) {
            if (chars[i] != 'l') {
                System.out.println("false");
                break;

            } else {
                i++;
            }
            if (chars[i] == 'y') {
                System.out.println("true: the end of chars3 is L & Y");
            } else {
                System.out.println("false");
            }
        }
    }
}

