package arraysListsAutoboxingUnboxing;

import java.util.Scanner;

public class ArraySort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] intArray = getIntegers(5);
        int[] intArray = {40, 36, 25, 20, 3};
//        largest2NumArray(intArray);
        intArray = sortArrAsc(intArray);
        printArray(intArray);
    }

    public static int[] getIntegers(int size) {
        System.out.println("Enter " + size + " integer values below: \r");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The value at index " + i + " is: " + arr[i]);
        }
    }

    public static int[] sortArrAsc(int[] arr) {
        int m, n, o;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                m = arr[j];
                n = arr[j+1];
                if (m>n){
                    arr[j] = n;
                    arr[j+1] = m;
                }
            }
        }
        return arr;

    }

    public static void largest2NumArray(int[] arr) {
        int m = arr[0];
        int n;
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            n = arr[i];
            if(m<n){
                o = m;
                m = n;
            }
            else if (o<n){
                o=n;
            }
        }
        System.out.println("Largest Number in the array is: " + m);
        System.out.println("2nd Largest Number in the array is: " + o);
    }
}
