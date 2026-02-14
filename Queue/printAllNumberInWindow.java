package Queue;

import java.util.LinkedList;
import java.util.*;

public class printAllNumberInWindow {

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        display(arr,3);

    }

   static void display(int [] arr,int k){
        Queue<Integer>q=new LinkedList<>();
        int i=0;
        while(i<k) {
            q.add(arr[i]);
            i++;
        }
        while(i<arr.length){
            System.out.println(q);
            q.poll();
            q.add(arr[i]);
            i++;
        }
       System.out.println(q);

    }
}
