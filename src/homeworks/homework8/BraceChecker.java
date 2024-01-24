package homeworks.homework8;

public class BraceChecker {
  private   String text;
    BraceChecker (String text){
        this .text = text;
    }
    public void check (){
        Stack stack = new Stack();
        int last;
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c){
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ')':
                     last = stack.pop();
                    if (last==0){
                        System.out.println("ERROR: at "+i+"closed ) but not opened");
                    }else {
                     lastBracket = (char) last;
                    if (lastBracket != '('){
                        System.out.println("ERROR: at " + i + "opened " + lastBracket + "but closed " + c);
                    }
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last==0){
                        System.out.println("ERROR: at "+i+"closed ) but not opened");
                    }else {
                         lastBracket = (char) last;
                        if (lastBracket != '['){
                            System.out.println("ERROR: at " + i + "opened " + lastBracket + "but closed " + c);
                        }
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last==0){
                        System.out.println("ERROR: at "+i+"closed ) but not opened");
                    }else {
                        lastBracket = (char) last;
                        if (lastBracket != '{'){
                            System.out.println("ERROR: at " + i + "opened " + lastBracket + "but closed " + c);
                        }
                    }
                    break;
        }

        }
        while (!stack.isEmpty()){
            System.out.println("ERROR: opened "+ (char) stack.pop()+"but not closed");

        }
    }
}
