package HomeWork5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] result = spaceArray;
        int d = 0;
        int c = 0;
        boolean y = false;
        boolean x = false;
        for (int i = 0; i < spaceArray.length; i++) {
            while (spaceArray[i] != ' ') {
                x = true;
                if (spaceArray[i] != ' ') {
                    break;
                }
            }
        }
        if (x != false) {
            c++;
        }
        for (int i = spaceArray.length - 1; i > c; i--) {
            while (spaceArray[i] != ' ') {
                y = true;
                if (spaceArray[i] != ' ') {
                    break;
                }
            }
        }
        if (x != false) {
            d++;
        }
        for (int i = c; i < result.length - d; i++) {
            System.out.print(result[i]);
        }

    }

}













