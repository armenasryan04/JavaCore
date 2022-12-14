package Examples;

public class ExampleForTree {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

        }

    }
}


