package arraysListsAutoboxingUnboxing.arrays;

import static aaaProgramsPractice.BubbleSort.printArray;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] arr2 = {56, 2 , 6, 1, 67};
        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};
        arr3 = reverseArray(arr3);
        printArray(arr3);

    }

    public static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        int i = 0, j = arr.length-1;
        while(i<arr.length){
            revArr[i] = arr[j];
            i++;
            j--;
        }
        return revArr;
    }
}
