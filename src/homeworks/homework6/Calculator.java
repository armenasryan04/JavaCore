package homeworks.homework6;

import jdk.nashorn.internal.ir.IfNode;

public class Calculator {
    double plus (int one,int two){
        int answer = one + two;
        return answer;
    }
    double minus (int one,int two){
        int answer = one - two;
        return answer;
    }
    double divide (int one,int two){

        if (two== 0){
            System.err.print("Can't divide on 0");
        }else {
            int answer = one / two;
            return answer;
        }
        return 0;
    }
    double multiply (int one, int two) {
        int answer = one * two;
        return answer;
    }
    }



