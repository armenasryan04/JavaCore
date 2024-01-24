package homeworks.homework8;

public class Stack {
    private char[] array = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char symbol) {
        if (size == array.length) {
        extend();
        } else {
            array[++size] = symbol;
        }
    }

    private void extend() {
        char[] newArray = new char[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int pop() {
        if (size < 0) {
            System.out.println("Stack don't have element ");
            return -1;
        } else {
            return array[size--];
        }
    }
    public boolean isEmpty (){
        return size == -1;
    }
}