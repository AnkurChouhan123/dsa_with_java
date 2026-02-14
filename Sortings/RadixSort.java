package Sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class RadixSort {
    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 768, 42, 13};

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);


        radixSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void radixSort(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }




    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

//        // Prefix sum
//        for (int i = 1; i < 10; i++) {
//            count[i] += count[i - 1];
//        }
//
//        // Stable placement (right to left)
//        for (int i = n - 1; i >= 0; i--) {
//            int digit = (arr[i] / exp) % 10;
//            output[--count[digit]] = arr[i];
//        }
//
//        // Copy back
//        System.arraycopy(output, 0, arr, 0, n);


//        ------------ USE HASHMAP ----------  REFER GEEKS_FOR_GEEKS Practice
    }



}
