package HomeWorks;

public class IfForExample {
    public static void main(String[] args) {

        System.out.println("N1");  //N1
        int a=153;
        int b=141;
        if (b >a) {
            System.out.println("max:"+ b );

        }
        else {
            System.out.println("max:"+ a);
        }
        //N2
        System.out.println("N2");
        for(int i = b ; i < a + 1 ;i++){
            System.out.println(i);

        }
        //N3
        System.out.println("N3");
       char x =153;
        System.out.println(x);
        char y = 141;
        System.out.println(y);
        if (y == x) {
            System.out.println("a=b");

        }
        else {
            System.out.println("a havasar che b");
        }
    }
}
