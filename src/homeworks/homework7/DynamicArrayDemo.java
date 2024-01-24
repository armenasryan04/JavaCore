package homeworks.homework7;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 20; i++) {
            dynamicArray.add(i);
        }
        dynamicArray.print();
        dynamicArray.add(2, 5);
        dynamicArray.print();
        System.out.println(dynamicArray.getIndexByValue(44));


    }
}
