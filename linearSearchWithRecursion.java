
import java.util.ArrayList;

public class linearSearchWithRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,4,2,9,12};

       linearSearch(arr,0,arr.length,2);

    }
   static ArrayList<Integer>list=new ArrayList<>();
   static void linearSearch(int []arr,int pos,int n,int target){

       if(pos==n-1){
           System.out.println(list);
           return;
       }

       if(arr[pos]==target){
           list.add(pos);
       }
       linearSearch(arr,pos+1,n,target);

    }
}
