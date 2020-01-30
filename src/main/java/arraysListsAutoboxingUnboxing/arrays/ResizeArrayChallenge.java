package arraysListsAutoboxingUnboxing.arrays;

import static aaaProgramsPractice.BubbleSort.printArray;

public class ResizeArrayChallenge {

    public static void main(String[] args) {

        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};
        arr3 = resizeArray(arr3, 5);
        printArray(arr3);
        arr3 = resizeArray(arr3, 9);
        printArray(arr3);

    }

    public static int[] resizeArray(int[] arr, int newSize) {
        int[] tempArr = arr;
        int oldSize = arr.length;
        arr = new int[newSize];
        if(newSize<oldSize) {
            for (int i = 0; i < newSize; i++) {
                arr[i] = tempArr[i];
            }
        } else {
            for (int i = 0; i < oldSize; i++) {
                arr[i] = tempArr[i];
            }
        }
        return arr;
    }



}
