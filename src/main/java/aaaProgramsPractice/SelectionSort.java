package aaaProgramsPractice;

import static aaaProgramsPractice.BubbleSort.printArray;

public class SelectionSort {

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr2 = {7, 6, 6, 5, 4};
        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};
//        arr1 = selectionSortAscending(arr1);
        arr3 = selectionSortAscending1(arr3);
//        arr3 = selectionSortAscending2(arr3);
//        printArray(arr1);
//        printArray(arr2);
        printArray(arr3);
    }

    //Logic 1
    public static int[] selectionSortAscending1(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    //Logic 2. More efficient than Logic 1
    public static int[] selectionSortAscending2(int[] arr) {
        int temp, min;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //Logic 1
    public static int[] selectionSortDescending1(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    //Logic 2. More efficient than Logic 1
    public static int[] selectionSortDescending2(int[] arr) {
        int temp, min;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]<arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
