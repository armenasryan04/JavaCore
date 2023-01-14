package HomeWork7;

public class Calculator {
    double minus(double num, double num1) {
        System.out.println(num - num1);
        return num - num1;
    }
    double plus(double num, double num1) {
        System.out.println(num + num1);
        return num + num1;
    }
    double divide(double num, double num1) {
        if (num1 == 0) {
            System.out.println("cannot be divided by 0");

        } else {
            System.out.println(num / num1);
        }
        return num / num1;
        }
        double multiply ( double num, double num1){
        System.out.println(num * num1);
        return num * num1;
    }
}