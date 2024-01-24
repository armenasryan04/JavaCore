package homeworks.homework5;

public class SpaceDelete {
    int startChecker = 0;
    int endChecker = 0;
    int resultArrayLength;
    void spaceDelete(char[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                startChecker++;
            } else {
                break;
            }
        }
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == ' ') {
                endChecker++;
            } else {
                break;
            }
        }
        resultArrayLength= array.length - (startChecker+ endChecker);
    }
    void elementsForNewArray(char[] array,char[]result){
        int saver = 0;
        for (int j = startChecker;j < array.length-endChecker  ; j++) {
            result[saver++]= array[j];
        }
}
void printArray(char [] array){
    for (char c : array) {
        System.out.print(c);

    }
}

}



