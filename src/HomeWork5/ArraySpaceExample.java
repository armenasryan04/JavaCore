package HomeWork5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = { ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int c = 0;
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
        for (int n = c ; n < spaceArray.length; n++) {
            System.out.print(spaceArray[n]);
        }
    }
}












