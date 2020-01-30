package aaaProgramsPractice;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {7, 6, 6, 5, 4};
        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};
        arr1 = bubbleSortAscending(arr1);
        arr2 = bubbleSortAscending(arr2);
        arr3 = bubbleSortAscending(arr3);
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        arr1 = bubbleSortDescending(arr1);
        arr2 = bubbleSortDescending(arr2);
        arr3 = bubbleSortDescending(arr3);
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }

    public static int[] bubbleSortAscending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortDescending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

}
