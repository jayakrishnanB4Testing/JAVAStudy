package arraysListsAutoboxingUnboxing.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBubbleSort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] arr = getArray();
        arr = arraySortAscending(arr);
        printArray(arr);
        arr = arraySortDescending(arr);
        printArray(arr);

    }

    public static int[] getArray() {
        System.out.println("Enter the size of the array: ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arraySortAscending(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
//                printArray(arr);
            }
        }
        return arr;
    }

    public static int[] arraySortDescending(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
