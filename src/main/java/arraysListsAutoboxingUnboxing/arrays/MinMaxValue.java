package arraysListsAutoboxingUnboxing.arrays;

import javax.swing.text.StyleContext;

import static arraysListsAutoboxingUnboxing.arrays.ArrayBubbleSort.getArray;

public class MinMaxValue {

    public static void main(String[] args) {

        int[] arr = getArray();
        printMinValue(arr);
        printMaxValue(arr);
        printMinValues(arr);
        printMaxValues(arr);

    }

//    public static void getMinValue(int[] arr){
//        int m = arr[0], n;
//        for (int i = 0; i < arr.length; i++) {
//            n = arr[i]{
//
//            }
//        }
//    }

    public static void printMinValue(int[] arr){
        int m = arr[0], n;
        for (int i = 0; i < arr.length; i++) {
            n = arr[i];
            if(m>n){
                m=n;
            }
        }
        System.out.println(m);
    }

    public static void printMaxValue(int[] arr){
        int m = arr[0], n;
        for (int i = 0; i < arr.length; i++) {
            n = arr[i];
            if(m<n){
                m=n;
            }
        }
        System.out.println(m);
    }

    public static void printMinValues(int[] arr){
        int m = arr[0], n = 0, o;
        for (int i = 0; i < arr.length; i++) {
            o = arr[i];
            if(n>o) {
                m=o;
            }
        }
        System.out.println("Smallest: " + m +" and second smallest: " + n);
    }

    public static void printMaxValues(int[] arr){
        int m = arr[0], n = 0, o;
        for (int i = 0; i < arr.length; i++) {
            o = arr[i];
            if(m<o){
                n=m;
                m=o;
            } else if(n<o){
                n=o;
            }
        }
        System.out.println("Largest: " + m + " and second largest: " + n);
    }

}
