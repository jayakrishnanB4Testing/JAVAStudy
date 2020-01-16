package arraysListsAutoboxingUnboxing.arrays;

import static arraysListsAutoboxingUnboxing.arrays.ArrayBubbleSort.printArray;

public class ReferenceAndValueTypes {

    public static void main(String[] args) {

        int myInt = 10;
        int anotherInt = myInt;
        System.out.println(myInt);
        System.out.println(anotherInt);
        anotherInt++;
        System.out.println(myInt);
        System.out.println(anotherInt);

        int[] myArr = {2, 4, 5, 7, 4};
        int[] anotherArr = myArr;

        printArray(myArr);
        printArray(anotherArr);

        anotherArr[0] = 100;
        printArray(myArr);
        printArray(anotherArr);

    }

}
