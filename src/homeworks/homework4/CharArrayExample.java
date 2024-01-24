package homeworks.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        //How many c is in the array?
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                value++;
            }
        }
        System.out.println("In the array is " + "\n" + value + "-o");
        //print the 2 characters which are in the middle of array
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        System.out.println("print the 2 characters which are in the middle of array ");
        int checker = chars2.length / 2;
        System.out.println(chars2[checker - 1] + "\n" + chars2[checker]);
        // Check if it ends in l,y?
        System.out.println("Check if it ends in l,y?");
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        int helper = chars3.length;
        if (chars3[helper - 2] == 'l' & chars3[helper - 1] == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //don't print the spaces
        System.out.println("don't print the spaces");
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length ; i++) {
            if (text[i]!=' '){
                System.out.print(text[i]+" ");
            }
        }
    }

}
