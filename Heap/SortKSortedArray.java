package Heap;

import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int arr[]={6,5,3,2,8,10,9};
        sort(arr,3);
        for(int num:arr){
            System.out.println(num);
        }
    }
    static void sort(int arr[],int k){
        PriorityQueue <Integer>q=new PriorityQueue<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
           if(q.size()>k){
               arr[j]=q.poll();
           j++;
           }
        }
        while(!q.isEmpty()){
            arr[j++]=q.poll();
        }
    }
}
