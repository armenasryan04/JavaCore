package homeworks.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        //Figure N1
        System.out.print("Figure N1");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
        }
        // Figure N 2
        System.out.println();
        System.out.println("Figure N2");
        for (int i = 5; i > 0; i--) {
            System.out.println();
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        // Figure N3
        System.out.print("Figure N3");
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        //Figure N4
        System.out.println("Figure N4");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }

        }
        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n Figure N5");
        for (int i = 5; i >= 0; i--) {
            System.out.println();
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
        }
    }
}

