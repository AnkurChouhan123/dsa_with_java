package Sortings;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr={3,5,2,1,4};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i] - 1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// original sorting order will be

//num - index
//1      0
//2      1
//3      2

//AND SO ON