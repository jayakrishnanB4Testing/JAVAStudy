package arraysListsAutoboxingUnboxing.arrays;

import java.util.Scanner;

public class ArrayBubbleSort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        int arrSize = scanner.nextInt();
        int[] arr = getArray(arrSize);
        arr = arraySortAscending(arr);
        printArray(arr);
        arr = arraySortDescending(arr);
        printArray(arr);

    }

    public static int[] getArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        String array = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                array += "{" + arr[i] + ", ";
            }
            else if (i == arr.length-1) {
                array += arr[i] + "}";
            }
            else {
                array += arr[i] + ", ";
            }
        }
        System.out.println(array);
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
