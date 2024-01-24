package homeworks.homework8;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = "Hello from [Java]";
        String text2= "Hello from ([Java))";
BraceChecker check = new BraceChecker(text2);
check.check();
    }
}
