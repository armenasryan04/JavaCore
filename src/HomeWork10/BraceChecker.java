package HomeWork10;

public class BraceChecker {
    private String text;
    Stack stack = new Stack();
    public BraceChecker(String text1) {
        text = text1;
    }

    public void check() {
        char[] charOfText = text.toCharArray();
        for (int i = 0; i <charOfText.length ; i++) {

            switch (charOfText[i]){
                case '(':
                    stack.push(i);
                    break;
                case '{':
                        stack.push(i);
                        break;
                case '[':
                    stack.push(i);
                    break;
                case')':
                case '}':
                case']':
                    int check = stack.pop();
                    if (check==0){
                        System.out.println("error at"+ i );
                    }else {
                        System.out.println("normal e");
                    }


            }

        }


    }

}






