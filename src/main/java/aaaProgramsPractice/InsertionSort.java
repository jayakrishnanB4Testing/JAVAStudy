package aaaProgramsPractice;

import static aaaProgramsPractice.BubbleSort.printArray;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {7, 6, 6, 5, 4};
        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};

        arr1 = insertionSortAscending(arr1);
        arr2 = insertionSortAscending(arr2);
        arr3 = insertionSortAscending(arr3);
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }

    public static int[] insertionSortAscending(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            while(j-1 > -1) {
                if(arr[j-1]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        }
        return arr;
    }

    public static int[] insertionSortDescending(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            while(j-1 > -1) {
                if(arr[j-1]<arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        }
        return arr;
    }

}
