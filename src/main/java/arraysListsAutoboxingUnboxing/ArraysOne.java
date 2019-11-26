package arraysListsAutoboxingUnboxing;

import java.util.Scanner;

public class ArraysOne {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getArray(8);
        printArray(array);
        arrayAvg(array);

    }

    private static int[] getArray(int size) {
        System.out.println("Enter " + size + " integer values:");
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The value at index " + i + " is: " + arr[i]);
        }
    }

    private static void arrayAvg(int[] arr) {
        double sum = 0;
        double avg = 0;
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i++) {
            if (i==arrSize-1){
                avg = (sum + arr[i])/arrSize;
            }
            else{
                sum+=arr[i];
            }
        }
        System.out.println("The average of the integers in the Array is: " + avg);
    }
}
