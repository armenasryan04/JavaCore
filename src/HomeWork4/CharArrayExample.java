package HomeWork4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int quantity = 0;
        for (int i : chars) {
            if (c == i) {
                quantity++;
            }
        }
        System.out.println("quantity of c = " + quantity);
        System.out.println();
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("Մեջտեղում գտնվող սիմվոլներն են:" + chars2[3] + " & " + chars2[4]);


        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        for (int i = chars3.length - 2; i < chars3.length; i++) {
            if (chars3[i] != 'l') {
                System.out.println("false");
                break;

            } else {
                i++;
            }
            if (chars3[i] == 'y') {
                System.out.println();
                System.out.println("true: the end of chars3 is L & Y");
            } else {
                System.out.println("false");
            }
        }
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + " ");
            }

        }

    }
}
