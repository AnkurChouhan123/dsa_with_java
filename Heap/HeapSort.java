package Heap;

//import org.w3c.dom.ls.LSOutput;

import java.util.PriorityQueue;
//import java.util.jar.JarOutputStream;

public class HeapSort {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[] = {4, 1, 3, 9, 7};
        for (int num : arr) {
            pq.add(num);

        }
        int k=0;
        while(!pq.isEmpty()){
            arr[k++]=pq.poll();

        }
        for(int num:arr){
            System.out.println(num);
        }

    }
}
