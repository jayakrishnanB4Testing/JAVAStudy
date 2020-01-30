package aaaProgramsPractice;

import javax.sound.midi.Soundbank;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        int[] arr3 = {56, 2 , 6, 1, 67, 9, 27};
        maxValue(arr3);
        minValue(arr3);
    }

    public static void minValue(int[] arr){
        int m = arr[0], n;
        for (int i = 1; i < arr.length; i++) {
            n = arr[i];
            if(m>n) {
                m = n;
            }
        }
        System.out.println("Minimum value is: " + m);
    }

    public static void maxValue(int[] arr){
        int m = arr[0], n;
        for (int i = 1; i < arr.length; i++) {
            n = arr[i];
            if(m<n) {
                m = n;
            }
        }
        System.out.println("Maximum value is: " + m);
    }

}
