package HomeWorks;

public class FigurePainter {
    public static void main(String[] args) {

        System.out.print("Figure N1");
        for (int g = 0; g < 6; g++) {
            System.out.println();
            for (int k = 0; k < g; k++) {
                System.out.print(" *");

            }
        }

        System.out.println();
        System.out.println("Figure N2");
        //Figure N2
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int k = 5; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

        }
        System.out.println();
        System.out.println("figure N3");
        //Figure N3
        for (int g = 0; g < 5; g++) {
            System.out.println();
            for (int k = 5; k > g; k--) {
                System.out.print("* ");
            }
        }
    }
}