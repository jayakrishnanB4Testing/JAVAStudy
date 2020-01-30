package aaaProgramsPractice;

import static aaaProgramsPractice.BubbleSort.bubbleSortAscending;

public class Largest2AndSmallest2 {

    public static void main(String[] args) {
        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};
        largest2(arr3);
        smallest2(arr3);
    }

    public static void largest2(int[] arr) {
        arr = bubbleSortAscending(arr);
        System.out.println("Largest num is: " + arr[arr.length-1]);
        System.out.println("2nd largest num is: " + arr[arr.length-2]);
    }

    public static void smallest2(int[] arr) {
        arr = bubbleSortAscending(arr);
        System.out.println("Largest num is: " + arr[0]);
        System.out.println("2nd smallest num is: " + arr[1]);
    }

}
