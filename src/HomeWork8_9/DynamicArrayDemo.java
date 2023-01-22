package HomeWork8_9;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray demo  = new DynamicArray();
        demo.add(12);
        demo.add(15);
        demo.add(13);
        demo.add(166);
        demo.add(121);
        demo.add(10);
        demo.add(18);
        demo.add(19);
        demo.add(21);
        demo.add(79);
        demo.add(23);
        System.out.print(demo.getByIndex(2));
        System.out.println();
        demo.set(4,21);
        System.out.println(demo.exists(234));
        System.out.println(demo.getIndexByValue(54534));

    }
}
