package HomeWork2;

public class FigurePainter2 {
    public static void main(String[] args) {
        System.out.print("Figure N1");
        for (int i = 3; i >= 0; i--) {
            System.out.println();
            for (int k = i; k < 6; k++) {
                System.out.print("  ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print("* ");
            }

        }
        System.out.println();
        System.out.println("Figure N2");
        int j;
        int k;
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println();
            for (k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 2; j < i + 1; j++) {
                System.out.print("* ");


            }

        }
        if (i == 5) {
            for (i = 4; i > 0; i--) {
                System.out.println();
                for (k = 4; k > i; k--) {
                    System.out.print(" ");
                }
                for (j = 1; j < i + 1; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}