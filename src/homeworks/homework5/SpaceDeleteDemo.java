package homeworks.homework5;

public class SpaceDeleteDemo {
    public static void main(String[] args) {
        char[] spaceArray = {' ',' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        SpaceDelete spaceDelete = new SpaceDelete();
        spaceDelete.spaceDelete(spaceArray);
        char[]result = new char[spaceDelete.resultArrayLength];
        spaceDelete.elementsForNewArray(spaceArray,result);
        spaceDelete.printArray(result);
        System.out.println();
        spaceDelete.printArray(spaceArray);
        }

  }

