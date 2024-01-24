package homeworks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("poxos");
        names.add("gago");
        names.add("arsen");
        names.add("suren");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        boolean contains = false;
        for (String name : names) {
            if (choose.contains(name)) {
                contains = true;
            }
        }
        System.out.println(contains);
        choose = scanner.nextLine();
        System.out.println("Remove name");
        for (String name : names) {
            if (choose.contains(name)) {
                choose = name;
            }
        }
        names.remove(choose);
        for (String name : names) {
            System.out.println(name);
        }
        int index = Integer.parseInt(scanner.nextLine());
        choose = scanner.nextLine();
        names.add(index, choose);
        for (String name : names) {
            System.out.println(name);


        }
    }
}
